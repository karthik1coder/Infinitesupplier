package com.instantbusiness.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.instantbusiness.Entity.location;
public interface locationRepo  extends JpaRepository<location, Long> {
    
}
