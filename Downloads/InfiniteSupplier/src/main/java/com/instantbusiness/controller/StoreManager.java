package com.instantbusiness.controller;




import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.instantbusiness.Entity.store;

@RestController
@RequestMapping("/store")
public class StoreManager {
    
@PostMapping(
    value = "/add",
    consumes = "application/json",
    produces = "application/json"
)
public void addNewStore(@RequestBody store Store)
{
  
}

@DeleteMapping(
    value = "/delete",
    consumes = "application/json",
    produces = "application/json"
)
public void deleteStore(@RequestBody store Store)
{
    
}

@PutMapping(
    value = "/update",
    consumes = "application/json",
    produces = "application/json"
)
public void updateStore()
{

}








}
