package com.loopkitchen.loopkitchen.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.loopkitchen.loopkitchen.entity.Report;
import com.loopkitchen.loopkitchen.entity.Store;
import com.loopkitchen.loopkitchen.entity.storeid;

@Repository
public interface StoreDao extends JpaRepository<Store, storeid>{
	
	 @Query("select u From store u WHERE u.s.store_id= : n")
     public List<Store> findByStoreId(@Param("n") String id);
}
