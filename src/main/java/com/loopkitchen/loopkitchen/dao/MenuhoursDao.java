package com.loopkitchen.loopkitchen.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.loopkitchen.loopkitchen.entity.MenuHours;
import com.loopkitchen.loopkitchen.entity.Report;
//import com.loopkitchen.loopkitchen.entity.menuHoursId;
import com.loopkitchen.loopkitchen.entity.menuHoursId1;


@Repository
public interface MenuhoursDao extends JpaRepository<MenuHours, menuHoursId1>{
             
}
