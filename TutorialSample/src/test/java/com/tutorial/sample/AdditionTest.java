package com.tutorial.sample;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;



public class AdditionTest {
	Addition addition=null;
	
	@Before
	public void setUp(){
		addition = new Addition();
	}
	
	@Test
	public void testAdd(){
		assertEquals(5,addition.add(2, 3));
	}
	
	@After
	public void clearObject(){
		System.out.println("object value :"+addition);
		addition=null;
		System.out.println("object value :"+addition);
	}

	
}
