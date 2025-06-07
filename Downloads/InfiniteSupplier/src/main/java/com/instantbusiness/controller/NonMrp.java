package com.instantbusiness.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.instantbusiness.Entity.nonmrp;
import com.instantbusiness.Entity.nonmrpbarcode;

public class NonMrp {
    

     @PostMapping(
        value = "/add",
        consumes = "application/json",
        produces = "application/json")
    public void addNewMrpCategory(@RequestBody nonmrp Mrp) {
    }

    @PostMapping("/addMrpProduct")
    public void addNewMrpProduct(@RequestBody nonmrpbarcode Mrp) {
        
    }

    @GetMapping("/ProductByCategory")
    public void getProductByCategory(@RequestBody String category) {
    }
}
