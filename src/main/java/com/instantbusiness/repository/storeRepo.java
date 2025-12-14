package com.instantbusiness.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.JpaRepository;

import com.instantbusiness.Entity.store;


public interface storeRepo extends JpaRepository<store, Long> {

    @Query(value = "SELECT s.ratings, s.name, s.phonenumber, "
                 + "ST_Distance_Sphere(POINT(s.longitude, s.latitude), POINT(?1, ?2)) as distance "
                 + "FROM Location l "
                 + "INNER JOIN store s ON s.storeId = l.locationId "
                 + "WHERE ST_Distance_Sphere(POINT(s.longitude, s.latitude), POINT(?1, ?2)) <= ?3 "
                 + "AND s.ratings >= ?4 "
                 + "ORDER BY s.ratings DESC ",nativeQuery = true)
    List<store> findNearestLocation(double latitude,double longitude, double radius,double ratings, Long maximumlimit);
    
    

    

}
