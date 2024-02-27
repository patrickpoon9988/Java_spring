package com.example.firstspring.model;

import jakarta.persistence.Entity;

@Entity
public class RefEventStatus {

    // private fields
    private int status_id;
    private String status_desc;

    // public getter / setter
    public int getStatusId () {
        return status_id;
    }

    public void setStatusId (int id) {
        status_id = id;
    }

    public String getStatusDesc () {
        return status_desc;
    }

    public void setStatusDesc (String status) {
        status_desc = status;
    }
}