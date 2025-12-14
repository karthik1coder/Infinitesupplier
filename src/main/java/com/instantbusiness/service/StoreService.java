package com.instantbusiness.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.instantbusiness.Entity.store;
import com.instantbusiness.repository.storeRepo;



@Service
public class StoreService {
    
    

    @Autowired
    private storeRepo storeserviceRepo;


    public void performStoreOperation(store storeEntity, String operation, store newstore) {
        switch (operation.toUpperCase()) {
            case "INSERT":
                storeserviceRepo.save(storeEntity);
                break;
            case "DELETE":
                storeserviceRepo.delete(storeEntity);
                break;
            case "UPDATE":
                store oldstore = storeserviceRepo.findById(storeEntity.getStoreId()).orElse(null);
                if (oldstore == null) {
                    System.out.println("Store not found with ID: " + storeEntity.getStoreId());
                    return;
                }
                oldstore.setName(newstore.getName());
                oldstore.setLocation(newstore.getLocation());
                storeserviceRepo.save(oldstore);
                break;
            default:
                System.out.println("Invalid operation");
        }
    }


}
