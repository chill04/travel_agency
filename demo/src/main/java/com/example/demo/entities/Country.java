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
@Table(name="countries")
@Getter
@Setter
public class Country {

    @Id
    @Column(name = "country_id")
    Long id;
    @Column(name = "country")
    String country_name;
    @Column(name = "create_date")
    Date create_date;
    @Column(name = "last_update")
    Date last_update;


    Set<Division> divisions;
}
