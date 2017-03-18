package com.emajar.controller;

import com.emajar.domain.Post;
import com.emajar.repository.PostRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by drago on 18/03/17.
 */
@RestController
public class HomeController {

    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

    @Autowired
    PostRepository postRepository;

    @RequestMapping("/post")
    public String getPosts(){
        String result = "";
        for(Post post : postRepository.findAll()){
            result += post;
        }
        return result;
    }
}
