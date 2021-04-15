package com.fate.wiki.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

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
    @GetMapping("/hello")
    public String hello() {
        return "Hello World!";
    }
}
