package com.configurationExample;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Emanuele on 27/12/2016.
 */
@RestController
public class PageController {

    @Value("${pageController.welcomeMsg}")
    private String welcomeMsg;

    @RequestMapping("/")
    public String home(){
        return welcomeMsg;
    }
}
