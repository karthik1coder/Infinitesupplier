package com.instantbusiness.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.instantbusiness.Entity.nonmrpbarcode;

public interface nonMrpRepo extends JpaRepository<nonmrpbarcode, Long> {
    
}
