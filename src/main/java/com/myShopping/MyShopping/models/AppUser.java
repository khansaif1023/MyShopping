package com.myShopping.MyShopping.models;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;
@Entity // This annotation will tell hibernate that you
       // Need to create one table for this class
@Table
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class AppUser {

    @Id // This annotation tell that id is unique
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id; // unique base64Id--->It is the kind that got generated on the basisi of time
    @Column(nullable = false)
    private String name;

    @Column(unique = true,nullable = false)
    private String email;
    private String password;
    private String userType;
    @Column(unique = true,length = 10)
    private Long phoneNumber;

}
