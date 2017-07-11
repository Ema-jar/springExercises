package com.example.demo;

import com.example.model.Hello;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {

    @RequestMapping("/welcomeRest")
    public Hello welcomeRest(){
        Hello hello = new Hello("Emanuele");
        return hello;
    }
}
