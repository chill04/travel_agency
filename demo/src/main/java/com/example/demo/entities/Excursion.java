package com.example.demo.entities;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.Set;


@Entity
@Table(name="excursions")
@Getter
@Setter
public class Excursion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="excursion_id")
    Long id;
    @Column(name="excursion_title")
    String excursion_title;
    @Column(name="excursion_price")
    BigDecimal excursion_price;
    @Column(name="image_url")
    String image_URL;
    @CreationTimestamp
    @Column(name = "create_date")
    private Date create_date;

    @UpdateTimestamp
    @Column(name = "last_update")
    private Date last_update;

    @ManyToOne
    @Column(name="vacation_id")
    Vacation vacation;

    @OneToMany(cascade = CascadeType.ALL)
    Set<CartItem> cartItems;

}
