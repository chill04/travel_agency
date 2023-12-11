package com.example.demo.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;
import java.util.Set;


@Entity
@Table(name="cart_items")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CartItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cart_item_id", nullable = false)
    private Long id;

    @CreationTimestamp
    @Column(name = "create_date")
    private Date create_date;
    @UpdateTimestamp
    @Column(name = "last_update")
    private Date last_update;

    @ManyToOne
    @JoinColumn(name="vacation_id", nullable = false)
    private Vacation vacation;

    @ManyToOne
    @JoinColumn(name = "cart_id")
    private Cart cart;

    @ManyToMany(mappedBy = "cartItems")
    private Set<Excursion> excursions;




}
