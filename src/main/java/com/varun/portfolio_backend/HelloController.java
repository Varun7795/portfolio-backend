package com.varun.portfolio_backend;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class HelloController {

    int visitorCount = 0;

    @GetMapping("/visitors")
    public String getVisitors() {

        visitorCount++;

        return "🔥 Total Visitors: " + visitorCount;
    }
}