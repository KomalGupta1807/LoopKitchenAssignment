package com.loopkitchen.loopkitchen.dao;
import com.loopkitchen.loopkitchen.entity.*;

import org.springframework.data.jpa.repository.JpaRepository;

import com.loopkitchen.loopkitchen.entity.StoreTimezone;

public interface StoreTimezoneDao extends JpaRepository<StoreTimezone, String>{

}
