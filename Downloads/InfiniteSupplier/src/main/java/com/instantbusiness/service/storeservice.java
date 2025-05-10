package com.instantbusiness.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.instantbusiness.Entity.store;
import com.instantbusiness.repository.storeRepo;

public class storeservice {
    

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
            //  custom exception
        }
        oldstore.setName(newstore.getName());
        oldstore.setStoreId(newstore.getStoreId());
        oldstore.setLocation(newstore.getLocation());
        storeserviceRepo.save(oldstore);
    }


}
