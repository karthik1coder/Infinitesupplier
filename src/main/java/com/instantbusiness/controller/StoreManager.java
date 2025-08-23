package com.instantbusiness.controller;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.instantbusiness.Entity.store;
import com.instantbusiness.service.StoreService;

@RestController
@RequestMapping("/store")
public class StoreManager {

   @Autowired
    private StoreService storeService;
    
@PostMapping(
    value = "/add",
    consumes = "application/json",
    produces = "application/json"
)
public void addNewStore(@RequestBody store Store)
{
   storeService.addNewStore(Store);
}

@DeleteMapping(
    value = "/delete",
    consumes = "application/json",
    produces = "application/json"
)
public void deleteStore(@RequestBody store Store)
{
    storeService.deleteStore(Store);
}

@PutMapping(
    value = "/update",
    consumes = "application/json",
    produces = "application/json"
)
public void updateStore(Long storeId, @RequestBody store newStore) {
    store oldStore = new store();
    oldStore.setStoreId(storeId);
    storeService.updateStore(oldStore, newStore);
}


}
