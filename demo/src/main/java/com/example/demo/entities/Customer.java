package com.example.demo.entities;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;
import java.util.Set;


@Entity
@Table(name="customers")
@Getter
@Setter
public class Customer {
    @Id
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
    @Column(name = "create_date")
    Date create_date;
    @Column(name = "last_update")
    Date last_update;
    @Column(name = "division_id")
    Division division;
//    @Column("xxxx")
    Set<Cart> carts;
}
