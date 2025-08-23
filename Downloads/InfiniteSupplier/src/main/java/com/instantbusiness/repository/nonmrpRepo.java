package com.instantbusiness.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.instantbusiness.Entity.nonmrpbarcode;

public interface nonmrpRepo extends JpaRepository<nonmrpbarcode, Long> {
    
    @Query("DELETE from nonmrpbarcode m where m.expiryDate <= CURRENT_DATE")
    void  deleteEntitiesForExpiredBarCode();
    
}
