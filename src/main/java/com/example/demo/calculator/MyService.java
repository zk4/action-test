package com.example.demo.calculator;

import org.springframework.stereotype.Service;

@Service
public class MyService  {
    public String add(String name){
        return name+" hello";
    }
}
