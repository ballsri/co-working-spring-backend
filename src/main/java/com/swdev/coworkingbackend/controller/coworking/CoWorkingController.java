package com.swdev.coworkingbackend.controller.coworking;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/coworking")
public class CoWorkingController {
    @Autowired
    @GetMapping("/")
    public String getAllCoWorkingSpaces(){
        return String.format("all coworking spaces");
    }

}
