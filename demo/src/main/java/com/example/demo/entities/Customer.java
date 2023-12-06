package com.example.demo.entities;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.sql.Date;
import java.util.Set;


@Entity
@Table(name="customers")
@Getter
@Setter
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_id")
    Long id;

    @Column(name = "customer_first_name")
     String firstName;

    @Column(name = "customer_last_name")
    String lastName;

    @Column(name = "address")
    String address;

    @Column(name = "postal_code")
    String postal_code;

    @Column(name = "phone")
    String phone;
    @CreationTimestamp
    @Column(name = "create_date")
    private Date create_date;

    @UpdateTimestamp
    @Column(name = "last_update")
    private Date last_update;
    @Column(name = "division_id")

    @ManyToOne
    Division division;

    @OneToMany(cascade = CascadeType.ALL)
    Set<Cart> carts;
}
