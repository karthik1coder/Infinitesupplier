package com.instantbusiness.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.instantbusiness.Entity.store;
import com.instantbusiness.repository.storeRepo;



@Service
public class StoreService {
    
    

    @Autowired
    private storeRepo storeserviceRepo;

    public void addNewStore(store store) {
        storeserviceRepo.save(store);
    }

    public void deleteStore(store store) {
        storeserviceRepo.delete(store);
    }

    public void updateStore(store StoreId,store newstore) {
        store oldstore = storeserviceRepo.findById(StoreId.getStoreId()).orElse(null);
        if (oldstore == null) {
            System.out.println("Store not found with ID: " + StoreId.getStoreId());
            return;
        }
        oldstore.setName(newstore.getName());
        oldstore.setStoreId(newstore.getStoreId());
        oldstore.setLocation(newstore.getLocation());
        storeserviceRepo.save(oldstore);
    }


}
