package com.example.demo.entities;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name="customer")
@Getter
@Setter
public class CartItem {
    Long id;
    Vacation vacation;
    Set<Excursion> excursions;
    Cart cart;
    Date create_date;
    Date last_update;
    Division division;
    Set<Cart> carts;
}
