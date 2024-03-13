package com.example.firstspring.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class UUID {
    @Id
    private String uuid;

    public String getUUID() {
        return uuid;
    }

    public void setUUID(String value) {
        uuid = value;
    }
}
