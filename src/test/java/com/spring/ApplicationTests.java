package com.spring;

import com.spring.mapper.TestMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {


	@Autowired
	TestMapper testMapper;

	@Test
	public void contextLoads() {
	}

	@Test
	public void testTest(){
		Long id = 1L;
		com.spring.entity.Test test = testMapper.test(id);
		System.out.println(test.getInfo());
	}

}
