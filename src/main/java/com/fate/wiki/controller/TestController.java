package com.fate.wiki.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController//return a string
//@ResponseBody return a string or json
//@Controller//return a page
public class TestController {
    @Value("${test.hello}")
    private String testHello;
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
    //RequestMapping(value="/user/1", method = RequestMethod.GET);
    //it supports all the requesting ways
    @GetMapping("/hello")
    public String hello(){
        return "Hello World!" + testHello;
    }


    @RequestMapping("/hello/post")
    public String helloPost(String name) {
        return "Hello dude, " + name;
    }



    
//    @PostMapping("/hello/post")
//    public String helloPost(String name){
//        return "Hello dude! Post, " + name;
//    }
}
