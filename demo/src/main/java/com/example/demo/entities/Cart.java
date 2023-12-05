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
public class Cart {
    Long id;
    String orderTrackingNumber;
    BigDecimal package_price;
    int party_size;
    StatusType status;
    Date create_date;
    Date last_update;
    Customer customer;
    Set<CartItem> cartItem;
}
