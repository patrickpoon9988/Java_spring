package com.example.firstspring.controller;

import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class GraphQLController {
    @QueryMapping 
    public String hello() { 
        return "Hello, world!";
    }
}
