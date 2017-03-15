package com.prassannas.java8.junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import junit.framework.Assert;

public class UserServiceTest {
	
	private UserService userSevice;
	private User user;
	
	@Before
	public void before(){
		userSevice = new UserService();
		
	}

	@Test
	public void testGetAgeIsNull() {
		user =  Mockito.mock(User.class);
		Mockito.when(user.getAge()).thenReturn(null);
		
		Assert.assertEquals("UNKOWN", userSevice.getAge(user));
	}
	
	@Test
	public void testUserIsNull() {
		Assert.assertEquals("UNKOWN", userSevice.getAge(user));
	}
	
	
	@Test
	public void testUserAndAgeisValid() {
		user =  Mockito.mock(User.class);
		Mockito.when(user.getAge()).thenReturn("25");
		
		Assert.assertEquals("25", userSevice.getAge(user));
	}
	
	@Test
	public void testUserIsNotNullButAgeisNull(){
		user =  Mockito.mock(User.class);
		Mockito.when(user.getAge()).thenReturn(null);
		
		Assert.assertEquals("UNKOWN", userSevice.getAge(user));
	}
	
	
	
	
	@After
	public void after(){
		userSevice = null;
		user = null;
	}

}
