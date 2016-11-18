package com.sogrp.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/posts")
public class PostsController {

    @RequestMapping(value = "", method = RequestMethod.GET)
    public ResponseEntity index() {
        int[] emptyArray = {};
        return new ResponseEntity(emptyArray, HttpStatus.ACCEPTED);
    }
}
