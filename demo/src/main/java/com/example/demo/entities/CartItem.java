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
@Table(name="cart_items")
@Getter
@Setter
public class CartItem {
    @Id
    @Column(name = "cart_item_id")
    Long id;
    @Column(name = "vacation_id")
    Vacation vacation;

//    @Column
    Set<Excursion> excursions;

    @Column(name = "cart_id")
    Cart cart;
    @Column(name = "create_date")
    Date create_date;
    @Column(name = "last_update")
    Date last_update;
    Division division;
    Set<Cart> carts;
}
