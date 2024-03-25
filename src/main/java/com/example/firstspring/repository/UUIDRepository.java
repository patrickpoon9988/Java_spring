package com.example.firstspring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.firstspring.model.UUID;

@Repository
public interface UUIDRepository extends JpaRepository<UUID, String> {
    
}
