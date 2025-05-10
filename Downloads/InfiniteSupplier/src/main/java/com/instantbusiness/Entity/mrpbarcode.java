package com.instantbusiness.Entity;

import javax.persistence.Table;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.Data;
import javax.persistence.GenerationType;

@Entity
@Table(name="barcode")
@Data
public class mrpbarcode {
    
    @Id 
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private Long mrpBarCodeId;

    private  Long productID;

    private Long storeID;

    private Date expiryDate;

    private Double price;

    private String description;

    @ManyToOne(targetEntity = mrp.class)
    @JoinColumn(name="mrpId")
    private mrp mrpProduct;

    @ManyToOne(targetEntity = store.class)
    @JoinColumn(name="storeId")
    private store storeProduct;



}
