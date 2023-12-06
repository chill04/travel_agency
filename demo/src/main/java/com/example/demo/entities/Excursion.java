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
@Table(name="excursions")
@Getter
@Setter
public class Excursion {
    @Id
    @Column(name="excursion_id")
    Long id;
    @Column(name="excursion_title")
    String excursion_title;
    @Column(name="excursion_price")
    BigDecimal excursion_price;
    @Column(name="image_url")
    String image_URL;
    @Column(name="create_date")
    Date create_date;
    @Column(name="last_update")
    Date last_update;
    @Column(name="vacation_id")
    Vacation vacation;

    Set<CartItem> cartItems;

}
