package com.instantbusiness.Entity;

import jakarta.persistence.Table;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import jakarta.persistence.GenerationType;

@Entity
@Table(name="mrpbarcode")
@Data
public class mrpbarcode {
    
    @Id 
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private Long mrpBarCodeId;

    private  Long productID;

   

    private Date expiryDate;

    private Double price;

    private String description;

    private String status;

    @ManyToOne(targetEntity = mrp.class)
    @JoinColumn(name="mrpId")
    private mrp mrpProduct;

    @OneToOne(targetEntity = store.class)
    @JoinColumn(name="storeId")
    private store storeProduct;



}
