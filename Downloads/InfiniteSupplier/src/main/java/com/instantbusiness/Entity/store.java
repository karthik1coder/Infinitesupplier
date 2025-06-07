package com.instantbusiness.Entity;



import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.Data;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;



@Entity
@Table(name ="store")
@Data
public class store {
    

    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long storeId;
   


    @NotEmpty(message = "Store name cannot be empty")
    @Size(max=100, message = "Store name cannot exceed 200 characters")
    private String name;



    @NotEmpty(message = "Owner name cannot be empty")

    @Size(max=100, message = "Owner name cannot exceed 100 characters")
    private String ownerName;



    @NotEmpty(message = "Phone number cannot be empty")
    @Size(min=2,max=20, message = "Phone number must be between 2 and 20 digits")
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
