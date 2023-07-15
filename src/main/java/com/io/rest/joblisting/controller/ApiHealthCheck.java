package com.io.rest.joblisting.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/health")
public class ApiHealthCheck {

    @GetMapping("")
    public String apiHealth()
    {
        return "<html><body><center><h2> Back-end is up and running !</h2></center></body></html>";
    }
}
