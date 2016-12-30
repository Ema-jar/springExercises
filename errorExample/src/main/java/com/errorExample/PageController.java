package com.errorExample;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Emanuele on 30/12/2016.
 */
@Controller
public class PageController {

    @RequestMapping("/test")
    public String testController() throws Exception {
        if(3 == 3)throw new Exception("General Exception");
        return "home";
    }

    @ExceptionHandler(Exception.class)
    public String HandleException(HttpServletRequest request, Exception ex, Model model){
        model.addAttribute("errorMessage", ex.getMessage());
        return "exceptionError";
    }
}
