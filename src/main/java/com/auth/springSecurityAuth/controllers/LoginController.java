package com.auth.springSecurityAuth.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
@GetMapping("/user")
    public String getUser(){
        return "Welcome user";
    }
@GetMapping("/admin")
    public String getadmin(){
        return"Welcome admin";
    }
}
