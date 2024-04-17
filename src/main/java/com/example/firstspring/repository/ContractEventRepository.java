package com.example.firstspring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.firstspring.model.ContractEvent;

@Repository
public interface ContractEventRepository extends JpaRepository<ContractEvent, Long> {
    
}
