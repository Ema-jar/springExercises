package com.example;

import com.customBeans.Computer;
import com.customBeans.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Emanuele on 27/12/2016.
 */
@RestController
public class PageController {

    private Computer computer;

    @Autowired
    public PageController(Computer computer){
        this.computer = computer;
    }

    @RequestMapping("/")
    public String home(){
        return "Computer: " + computer.toString();
    }
}
