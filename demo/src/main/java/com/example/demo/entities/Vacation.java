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
@Table(name="vacations")
@Getter
@Setter
public class Vacation {
    @Id
    @Column(name = "vacation_id")
    Long id;
    @Column(name = "vacation_title")
    String vacation_title;
    @Column(name = "description")
    String description;
    @Column(name = "travel_fare_price")
    BigDecimal travel_price;
    @Column(name = "image_url")
    String image_URL;
    @Column(name = "create_date")
    Date create_date;
    @Column(name = "last_update")
    Date last_update;

    Set<Excursion> excursions;
}
