package com.instantbusiness.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.instantbusiness.Entity.mrpbarcode;

public interface mrpRepo extends JpaRepository<mrpbarcode, Long> {


    @Query("DELETE from mrpbarcode m where m.expiryDate <= CURRENT_DATE")
    void  deleteEntitiesForExpiredBarCode();

    
}
