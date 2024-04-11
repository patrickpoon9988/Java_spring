package com.example.firstspring.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import com.example.firstspring.model.*;

@Controller
public class GraphQLController {
    @QueryMapping 
    public String hello() { 
        return "Hello, world! patrickadasd";
    }
    
    @QueryMapping
    public List<ContractEvent> contractEvent() {
        List<ContractEvent> list = new ArrayList<ContractEvent>();
        list.add(new ContractEvent(1, "01.jpg", "01batch", "01quarter"));
        return list;
    }
}
