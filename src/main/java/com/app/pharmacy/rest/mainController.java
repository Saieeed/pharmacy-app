package com.app.pharmacy.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class mainController {

    @Value("${base.value}")
    private String val ;
    @GetMapping("/")
    public String base(){

        return val;
    }
}
