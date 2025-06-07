package com.instantbusiness.Entity;


import jakarta.persistence.Id;

import lombok.Data;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;



@Entity
@Table(name= "location")
@Data
public class location {

    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long locationId;

    private String pincode;

    private String city;

    private String state;

    private String country;


    private  List<Long> coordinates;

    @OneToMany(targetEntity = store.class)
    @JoinColumn(name="storeId")
    private List<store> Stores;


    private Double latitude;

    private Double longitude;



}
