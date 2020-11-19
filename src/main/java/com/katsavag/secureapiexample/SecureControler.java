package com.katsavag.secureapiexample;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/secure")
public class SecureControler {

    @GetMapping("bob")
    public ResponseEntity getBobGreetings(){
        return new ResponseEntity("Hello from BoB", HttpStatus.OK);
    }

    @GetMapping("alice")
    public ResponseEntity getAliceGreetings(){
        return new ResponseEntity("Hello from Alice", HttpStatus.OK);
    }

}
