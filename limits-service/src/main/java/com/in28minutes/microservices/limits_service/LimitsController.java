package com.in28minutes.microservices.limits_service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class LimitsController {

    @GetMapping("/limits")
    public Limits retrieveLimits() {
        // Hardcoded return for now
        return new Limits(1, 1000);
    }
}
