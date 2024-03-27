package com.myShopping.MyShopping.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table

public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    //whenever we will add a new product so a new unique id automatically get genrated
    private UUID id;
    private String name;
    private String category;
    private int quantity;
    private int price;
    @ManyToOne
    private AppUser user;
    // Relationship b/w user table and product table
    //User which we will be consendring here is only sellers type
    //many products in product table can be owned by one user so relationship is many to one
    private String rating;
    private String description;


}
