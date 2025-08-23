package com.instantbusiness.Entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Table(name="barcode")
@Data
public class nonmrpbarcode {
    
    @Id 
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private Long nonMrpBarCodeId;

    private  Long productID;

    private Long storeID;

    private Date expiryDate;

    private Double price;

    private String description;

    @ManyToOne(targetEntity = nonmrp.class)
    @JoinColumn(name="nonMrpId")
    private nonmrp nonmrpProduct;



}