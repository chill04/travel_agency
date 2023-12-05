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
public class Country {
    Long id;
    String country_name;
    Date create_date;
    Date last_update;
    Set<Division> divisions;
}
