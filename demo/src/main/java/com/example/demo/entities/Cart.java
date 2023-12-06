package com.example.demo.entities;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.Set;


@Entity
@Table(name="carts")
@Getter
@Setter
public class Cart {
    enum StatusType {
        pending,
        ordered,
        cancelled
    }
    @Id
    @Column(name = "cart_id")
    Long id;
    @Column(name = "order_tracking_number")
    String orderTrackingNumber;
    @Column(name = "package_price")
    BigDecimal package_price;
    @Column(name = "party_size")
    int party_size;
    @Column(name = "status")
    StatusType status;
    @Column(name = "create_date")
    Date create_date;
    @Column(name = "last_update")
    Date last_update;
    @Column(name = "customer_id")
    Customer customer;

    Set<CartItem> cartItem;
}
