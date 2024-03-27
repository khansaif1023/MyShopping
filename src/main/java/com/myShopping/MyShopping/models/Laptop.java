package com.myShopping.MyShopping.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;
@Entity
@Table
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Laptop {
    @Id
    private UUID id;
    private String name;


}
