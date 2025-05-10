package com.instantbusiness.Entity;




import org.springframework.data.annotation.Id;

import jakarta.persistence.OneToMany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

import lombok.Data;




@Entity
@Data
@Table(name= "mrp")
public class mrp {

    @Id 
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private Long mrpId;


    private String name;


    private String Manufacturer;


    private Double price;

    private String description;

    private List<String> category;

    private String imageUrl;
  


    @OneToMany(targetEntity = mrpbarcode.class)
    @JoinColumn(name="mrpBarCodeId")
    private List<mrpbarcode> mrpBarCodes;

  


    
}
