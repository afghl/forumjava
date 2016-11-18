package com.sogrp;

import com.sogrp.mapper.TodoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
public class ForumJavaApplication {

	@Autowired
	private TodoMapper todoMapper;

	public static void main(String[] args) {
		SpringApplication.run(ForumJavaApplication.class, args);

//		// test mybatis integration
		System.out.println("test mybatis integration!!!!");
		System.out.println(new ForumJavaApplication().todoMapper);
//		System.out.println(new ForumJavaApplication().m.findById(2).getContent());
	}
}
