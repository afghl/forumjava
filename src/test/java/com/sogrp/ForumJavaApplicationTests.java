package com.sogrp;

import com.sogrp.mapper.TodoMapper;
import com.sogrp.model.Todo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ForumJavaApplicationTests {

	@Autowired
	private TodoMapper todoMapper;

	@Test
	public void contextLoads() {
		Assert.assertNotNull(todoMapper);
		Todo todo = todoMapper.findById(8);
		Assert.assertEquals("hehecaonima", todo.getContent());
	}

}
