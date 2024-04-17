package com.example.firstspring.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class ContractImage {
    
    @Id
    public int image_id;

    public String image_name;

    public String road_name;

    public String hmd;

    public String contract_name;

    public String false_negative_type;
}
