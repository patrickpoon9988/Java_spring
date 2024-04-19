package com.example.firstspring.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.firstspring.model.*;
import com.example.firstspring.repository.ContractEventRepository;
import com.example.firstspring.repository.ContractImageRepository;

@Controller
public class GraphQLController {

    @Autowired
	private ContractEventRepository contractEventRepository;

    @Autowired
    private ContractImageRepository contractImageRepository;

    @QueryMapping 
    public String hello() { 
        return "Hello, world! patrickadasd";
    }
    
    @QueryMapping
    public List<ContractEvent> contractEvent() {
        return contractEventRepository.findAll();
    }

    @QueryMapping
    public List<ContractImage> contractImage(@Argument int image_id) {
        System.out.println(image_id);
        return contractImageRepository.findAll();
    }
}
