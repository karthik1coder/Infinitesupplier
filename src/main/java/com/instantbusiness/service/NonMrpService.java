package com.instantbusiness.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.instantbusiness.Entity.nonmrp;
import com.instantbusiness.Entity.nonmrpbarcode;
import com.instantbusiness.Enum.DBOperation;
import com.instantbusiness.repository.nonMrpBarCodeRepo;
import com.instantbusiness.repository.nonMrpRepo;


@Service
public class NonMrpService {
    

     @Autowired 
    private nonMrpBarCodeRepo nonmrpserviceRepo;

    @Autowired
    private nonMrpRepo nonMrpCategoryRepo;

    public void performBarCodeOperation(nonmrpbarcode nonMrpBarCode, DBOperation nonMrpOperation, nonmrpbarcode newNonMrpBarCode) 
    {
        switch(nonMrpOperation) {
            case INSERT:
                nonmrpserviceRepo.save(nonMrpBarCode);
                break;
            case DELETE:
                nonmrpserviceRepo.delete(nonMrpBarCode);
                break;
            case UPDATE:
                nonmrpbarcode oldNonMrpBarCode = nonmrpserviceRepo.findById(nonMrpBarCode.getNonMrpBarCodeId()).orElse(null);
                if (oldNonMrpBarCode == null) {
                    System.out.println("Non-MRP barcode not found with ID: " + nonMrpBarCode.getNonMrpBarCodeId());
                    return;
                }
                oldNonMrpBarCode = newNonMrpBarCode;
                nonmrpserviceRepo.save(oldNonMrpBarCode);
                break;
            default:
                System.out.println("Invalid operation");
        }
    }

    public void complain()
    {
        nonmrpserviceRepo.deleteEntitiesForExpiredBarCode();
    }

    public void performCategoryOperation(nonmrp nonmrpCategory, DBOperation nonMrpOperation, nonmrp newNonMrpCategory) {
        switch (nonMrpOperation) {
            case INSERT:
                nonMrpCategoryRepo.save(nonmrpCategory);
                break;
            case DELETE:
                nonMrpCategoryRepo.delete(nonmrpCategory);
                break;
            case UPDATE:
                nonmrp oldNonMrpCategory = nonMrpCategoryRepo.findById(nonmrpCategory.getNonMrpId()).orElse(null);
                if (oldNonMrpCategory == null) {
                    System.out.println("Non-MRP Category not found with ID: " + nonmrpCategory.getNonMrpId());
                    return;
                }
                oldNonMrpCategory = newNonMrpCategory;
                nonMrpCategoryRepo.save(oldNonMrpCategory);
                break;
            default:
                System.out.println("Invalid operation");
        }
    }

    
}
