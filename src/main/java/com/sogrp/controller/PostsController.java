package com.sogrp.controller;

import com.sogrp.mapper.TodoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/posts")
public class PostsController {

    @Autowired
    private TodoMapper todoMapper;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public ResponseEntity index() {
        return new ResponseEntity(todoMapper.findAll(), HttpStatus.ACCEPTED);
    }
}
