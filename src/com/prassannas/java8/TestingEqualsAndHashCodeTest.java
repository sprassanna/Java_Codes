package com.prassannas.java8;

import org.junit.Assert;
import org.junit.Test;

public class TestingEqualsAndHashCodeTest {
	
	
	TestingEqualsAndHashCode obj;
	
	
	@Test
	public void testHashCode(){
		
		obj  = new TestingEqualsAndHashCode("Krisha","Prassanna");
		
		Assert.assertTrue(obj.hashCode() !=-1);
		
	}

}
