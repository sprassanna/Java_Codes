package com.prassannas.java8;

import java.util.Objects;

public class TestingEqualsAndHashCode {

	public TestingEqualsAndHashCode(String name, String surname) {
		super();
		this.name = name;
		this.surname = surname;
	}
	
	public TestingEqualsAndHashCode(){
		// Do thing
	}

	private String name;

	private String surname;

	@Override
	public int hashCode() {
		/*final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((surname == null) ? 0 : surname.hashCode());*/
		return Objects.hash(name,surname);
	}

	@Override
	public boolean equals(Object obj) {
		if(this == obj){
			return true;
		}
		if(obj==null){
			return false;
		}
		if(this.getClass()!= obj.getClass()){
			return false;
		}
		
		final TestingEqualsAndHashCode  other = (TestingEqualsAndHashCode) obj;
		
		if(!other.name.equals(this.name)) return false;
		
		if(!other.surname.equals(this.surname)) return false;
		
		
		return true;
	}

}
