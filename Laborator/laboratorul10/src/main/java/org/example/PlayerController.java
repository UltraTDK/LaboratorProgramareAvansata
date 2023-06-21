package org.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlayerController {
    @RequestMapping("/hello")
    public String sayHello() {
        return "Greetings from Spring Boot!";
    }
}

