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
public class Division {
    private Long id;
    private String division_name;
    private Date create_date;
    private Date last_update;
    private Country country;
    private Long country_ID;
    private Set<Customer> customers;
}
