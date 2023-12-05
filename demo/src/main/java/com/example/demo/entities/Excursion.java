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
public class Excursion {
    Long id;
    String excursion_title;
    BigDecimal excursion_price;
    String image_URL;
    private Date create_date;
    private Date last_update;
    Vacation vacation;
    Set<CartItem> cartItems;

}
