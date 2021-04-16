package com.fate.wiki.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController//return a string
//@ResponseBody return a string or json
//@Controller//return a page
public class TestController {

    /**
     * GET POST PUT DELETE
     *
     * /user?id=1
     * /user/1
     * @return
     */

    //PostMapping
    //PutMapping
    //DeleteMapping
    //RequestMapping(value="/user/1", method = RequestMethod.GET);
    //it supports all the requesting ways
    @RequestMapping("/hello/post")
    public String hello(String name) {
        return "Hello dude" + name;
    }



    
//    @PostMapping("/hello/post")
//    public String helloPost(String name){
//        return "Hello dude! Post, " + name;
//    }
}
