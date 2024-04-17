package com.example.firstspring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.firstspring.model.ContractImage;

@Repository
public interface ContractImageRepository extends JpaRepository<ContractImage, Long>{
    
}
