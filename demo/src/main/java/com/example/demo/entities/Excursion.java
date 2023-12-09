package com.example.demo.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;


@Entity
@Table(name="excursions")
@NoArgsConstructor
@AllArgsConstructor

@Getter
@Setter
public class Excursion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="excursion_id", nullable = false)
    private Long id;

    @Column(name="excursion_title")
    private String excursion_title;

    @Column(name="excursion_price")
    private BigDecimal excursion_price;

    @Column(name="image_url")
    private String image_URL;

    @CreationTimestamp
    @Column(name = "create_date")
    private Date create_date;
    @UpdateTimestamp
    @Column(name = "last_update")
    private Date last_update;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "vacation_id", nullable = false)
    private Vacation vacation;

    @ManyToMany
    @JoinTable(name = "excursion_cartItem",
            joinColumns = @JoinColumn(name = "excursion_id"),
                inverseJoinColumns = @JoinColumn(name = "cart_item_id"))
    private Set<CartItem> cartItems;


}
