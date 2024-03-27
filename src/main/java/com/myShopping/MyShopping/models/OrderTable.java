package com.myShopping.MyShopping.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.UUID;
@Entity
@Table
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class OrderTable {
    //Particular order can have a multiple products
    // Order table v/s product table relationship b/w
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private int totalPrice;
    private int totalQuantity;

    //Buyer is a user only----> we need to maintain relationship b/w userTable and ordertable
    @ManyToOne
    private AppUser user;
    @OneToMany
    //B/c of one to many annotation another table will get created which
    //OrderID vs ProdcutID
    //And this table will maintain details like what are product that are
    // Present in a particular order
    private List<Product> products;
    private String status;
    private String paymentMode;

}
