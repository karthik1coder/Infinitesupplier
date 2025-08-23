package com.instantbusiness.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.instantbusiness.Entity.mrpbarcode;

@RestController
@RequestMapping("/mrp")
public class Mrp {
    
    // This class is currently empty. 
    // You can implement methods to handle MRP-related operations here.
    // For example, you might want to add methods for adding, updating, or deleting MRP records.

    @PostMapping(
        value = "/add",
        consumes = "application/json",
        produces = "application/json")
    public void addNewMrpCategory(@RequestBody Mrp Mrp) {
        
    }

    @PostMapping("/addMrpProduct")
    public void addNewMrpProduct(@RequestBody mrpbarcode Mrp) {
        
    }

    @GetMapping("/ProductByCategory")
    public void getProductByCategory(@RequestBody String category) {
    }

    



    
}