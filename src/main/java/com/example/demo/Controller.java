package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/message")
    public ResponseEntity<String> message(){
        return new ResponseEntity<>("Hello from Bijay, Bangalore", HttpStatus.OK);
    }
}
