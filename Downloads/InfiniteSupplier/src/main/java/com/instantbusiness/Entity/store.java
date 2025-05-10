package com.instantbusiness.Entity;


import org.springframework.data.annotation.Id;

import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.Data;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.Table;



@Entity
@Table(name = "store")
@Data
public class store {
    

    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long storeId;

    private String name;

    private String ownerName;

    private long phoneNumber;

    private String address;


    private Double rating=100.00;


    @ManyToOne(targetEntity = location.class)
    @JoinColumn(name="locationId")
    private location Location;


    @OneToOne(targetEntity = mrpbarcode.class)
    @JoinColumn(name="mrpBarCodeId")
    List<mrpbarcode> MrpBarCodes;


    @OneToOne(targetEntity = nonmrpbarcode.class)
    @JoinColumn(name="nonMrpBarCodeId")
    List<nonmrpbarcode> NonMrpBarCodes;
}
