package com.loopkitchen.loopkitchen.dao;
import com.loopkitchen.loopkitchen.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReportDao extends JpaRepository<Report, String>{
     
}
