package com.prassannas.java8.junit;

public class UserService {
	
	public String getAge(User user){
		if(user == null || user.getAge() == null){
			return "UNKOWN";
		}
		return user.getAge();
	}
	
	public static void main(String[] args) {
		System.out.println("UserService.main()");
		System.out.println(((Integer)null).valueOf(42));
	}

}
