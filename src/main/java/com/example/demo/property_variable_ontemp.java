package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class property_variable_ontemp {
    @RequestMapping("/")
    public String homepage(){
        return "PropertyVariableOnTemplate";
    }
}
