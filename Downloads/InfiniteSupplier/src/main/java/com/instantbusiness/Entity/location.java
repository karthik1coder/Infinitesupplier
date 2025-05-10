package com.instantbusiness.Entity;


import org.springframework.data.annotation.Id;

import lombok.Data;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;



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
