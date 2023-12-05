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
public class Vacation {
    Long id;
    String vacation_title;
    String description;
    BigDecimal travel_price;
    String image_URL;
    Date create_date;
    Date last_update;
    Set<Excursion> excursions;
}
