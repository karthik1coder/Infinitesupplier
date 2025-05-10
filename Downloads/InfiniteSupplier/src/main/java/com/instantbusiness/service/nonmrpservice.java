package com.instantbusiness.service;

import org.springframework.beans.factory.annotation.Autowired;


import com.instantbusiness.Entity.nonmrpbarcode;
import com.instantbusiness.repository.nonmrpRepo;

public class nonmrpservice {
    

     @Autowired 
    private nonmrpRepo nonmrpserviceRepo;

    public void addNewMrp(nonmrpbarcode nonmrp) {
        nonmrpserviceRepo.save(nonmrp);
    }
    public void deleteMrp(nonmrpbarcode nonmrp) {
        nonmrpserviceRepo.delete(nonmrp);
    }

    public void updateMrp(nonmrpbarcode mrp, nonmrpbarcode newmrp) {
        nonmrpbarcode oldmrp = nonmrpserviceRepo.findById(mrp.getNonMrpBarCodeId()).orElse(null);
        if (oldmrp == null) {
            //  custom exception
        }
        oldmrp = newmrp;
        nonmrpserviceRepo.save(oldmrp);
    }
    public void complain()
    {
        nonmrpserviceRepo.deleteEntitiesForExpiredBarCode();
    }
}
