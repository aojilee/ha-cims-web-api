package com.jos.ha.cims.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class TestController {
    
    @RequestMapping("/test")
    public String index() {
    	oracle.jdbc.driver.OracleDriver driver;
        return "Greetings from Spring Boot!";
    }
    
}
