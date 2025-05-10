package com.instantbusiness.repository;

import java.util.List;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.instantbusiness.Entity.store;


@Repository
public interface storeRepo extends JpaRepository<store, Long> {

    @Query("SELECT s.ratings,s.name,s.phonenumber,distance as ST_Distance_Sphere(POINT(s.longitude, s.latitude), POINT(?1, ?2)), FROM Location s "+
    "inner join store s"+
    "on s.storeId = l.locationId "+
    "WHERE distance <= ?3"+
    "and s.ratings>= ?4"+
    "order by ratings desc"+
    "limit ?5")
    List<store> findNearestLocation(double latitude,double longitude, double radius,double ratings, Long maximumlimit);
    

    

}
