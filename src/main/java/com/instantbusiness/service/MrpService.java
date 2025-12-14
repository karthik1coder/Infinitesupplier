package com.instantbusiness.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.instantbusiness.Entity.mrp;
import com.instantbusiness.Entity.mrpbarcode;
import com.instantbusiness.Enum.DBOperation;
import com.instantbusiness.repository.mrpBarCodeRepo;
import com.instantbusiness.repository.mrpRepo;


@Service
public class MrpService {
    

    @Autowired 
    private mrpBarCodeRepo mrpserviceRepo;

    @Autowired
    private mrpRepo mrpcategoryRepo;


    public void perfomBarCodeOperation(mrpbarcode mrpBarCode, DBOperation mrpOperation, mrpbarcode newMrpBarCode) 
    {
        switch(mrpOperation) {
            case INSERT:
                mrpserviceRepo.save(mrpBarCode);
                break;
            case DELETE:
                mrpserviceRepo.delete(mrpBarCode);
                break;
            case UPDATE:
                mrpbarcode oldMrpBarCode = mrpserviceRepo.findById(mrpBarCode.getMrpBarCodeId()).orElse(null);
                if (oldMrpBarCode == null) {
                    System.out.println("MRP barcode not found with ID: " + mrpBarCode.getMrpBarCodeId());
                    return;
                }
                oldMrpBarCode = newMrpBarCode;
                mrpserviceRepo.save(oldMrpBarCode);
                break;
            default:
                System.out.println("Invalid operation");
        }
    }
    public void complain()
    {
        mrpserviceRepo.deleteEntitiesForExpiredBarCode();
    }

    public void performCategoryOperation(mrp mrpCategory, DBOperation mrpOperation, mrp newMrpCategory) {
        switch (mrpOperation) {
            case INSERT:
                mrpcategoryRepo.save(mrpCategory);
                break;
            case DELETE:
                mrpcategoryRepo.delete(mrpCategory);
                break;
            case UPDATE:
                mrp oldMrpCategory = mrpcategoryRepo.findById(mrpCategory.getMrpId()).orElse(null);
                if (oldMrpCategory == null) {
                    System.out.println("MRP Category not found with ID: " + mrpCategory.getMrpId());
                    return;
                }
                oldMrpCategory = newMrpCategory;
                mrpcategoryRepo.save(oldMrpCategory);
                break;
            default:
                System.out.println("Invalid operation");
        }
    }
    

}
