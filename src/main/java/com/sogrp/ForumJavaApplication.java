package com.sogrp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
//@EnableConfigurationProperties(ForumJavaProperties.class)
public class ForumJavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ForumJavaApplication.class, args);
	}
}
