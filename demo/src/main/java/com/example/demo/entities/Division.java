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
@Table(name="divisions")
@Getter
@Setter
public class Division {
    @Id
    @Column(name = "division_id")
    Long id;
    @Column(name = "division")
    String division_name;
    @Column(name = "create_date")
    Date create_date;
    @Column(name = "last_update")
    Date last_update;
//    @Column("xxxx")
    Country country;
    @Column(name = "country_id")
    Long country_ID;
//    @Column("xxxx")

    Set<Customer> customers;
}
