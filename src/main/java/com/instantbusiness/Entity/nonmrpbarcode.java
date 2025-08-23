package com.instantbusiness.Entity;

import java.sql.Date;

import jakarta.persistence.Table;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import jakarta.persistence.GenerationType;

@Entity
@Table(name="nonmrpbarcode")
@Data
public class nonmrpbarcode {
    
    @Id 
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private Long nonMrpBarCodeId;

    private  Long productID;


    private Date expiryDate;

    private Double price;

    private String description;

    private String status;

    @ManyToOne(targetEntity = nonmrp.class)
    @JoinColumn(name="nonMrpId")
    private nonmrp nonmrpProduct;

    @OneToOne(targetEntity = store.class)
    @JoinColumn(name="storeId")
    private store storeProduct;



}