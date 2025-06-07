package com.instantbusiness.Entity;

import java.util.List;

import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Entity
@Table(name = "nonmrp")
@Data
public class nonmrp {


    @Id 
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private Long nonMrpId;


    private String name;


    private String Manufacturer;


    private Double price;

    private String description;

    private List<String> category;

    private String imageUrl;
    

    @OneToMany(targetEntity = nonmrpbarcode.class)
    @JoinColumn(name="nonMrpBarCodeId")
    private List<nonmrpbarcode> nonMrpBarCodes;

    
}
