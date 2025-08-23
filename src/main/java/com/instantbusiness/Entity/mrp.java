package com.instantbusiness.Entity;




import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.List;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.Data;




@Entity
@Data
@Table(name= "mrp",
uniqueConstraints = {
    @UniqueConstraint(columnNames = {"name", "price", "Manufacturer"})
})

public class mrp {

    @Id 
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private Long mrpId;


    private String name;


    private String manufacturer;


    private Double price;

    private String description;
    
    @ElementCollection
    private List<String> category;

    private String imageUrl;
  


    @OneToMany(targetEntity = mrpbarcode.class)
    @JoinColumn(name="mrpBarCodeId")
    private List<mrpbarcode> mrpBarCodes;

  


    
}
