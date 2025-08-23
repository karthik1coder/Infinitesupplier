package com.instantbusiness.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.instantbusiness.Entity.mrpbarcode;
import com.instantbusiness.repository.mrpRepo;

public class MrpService {
    

    @Autowired 
    private mrpRepo mrpserviceRepo;

    public void addNewMrp(mrpbarcode mrp) {
        mrpserviceRepo.save(mrp);
    }
    public void deleteMrp(mrpbarcode mrp) {
        mrpserviceRepo.delete(mrp);
    }

    public void updateMrp(mrpbarcode mrp, mrpbarcode newmrp) {
        mrpbarcode oldmrp = mrpserviceRepo.findById(mrp.getMrpBarCodeId()).orElse(null);
        if (oldmrp == null) {
            System.out.println("MRP barcode not found with ID: " + mrp.getMrpBarCodeId());
            return;
        }
        oldmrp = newmrp;
        mrpserviceRepo.save(oldmrp);
    }
    public void complain()
    {
        mrpserviceRepo.deleteEntitiesForExpiredBarCode();
    }

}
