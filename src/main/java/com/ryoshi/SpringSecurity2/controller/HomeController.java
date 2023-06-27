package com.ryoshi.SpringSecurity2.controller;

import com.ryoshi.SpringSecurity2.config.RsaKeyProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class HomeController {

    @GetMapping
    public String getHome(Principal principal){
        return "Hello, JWT!" + principal.getName();
    }

}
