package com.prassannas.java8.forEach;

import java.util.Arrays;
import java.util.List;

import com.prassannas.java8.data.Gender;
import com.prassannas.java8.data.Person;

public class CollectionInJava8 {
	
	public static void main(String[] args) {
		
		List<Person>  personList = createPersonList();
		
		for(Person p : personList){
			System.out.println(p.getAge());
		}
		
		System.out.println("-- For Each -- ");
		personList.forEach(person -> System.out.println(person.getGender()));
		
		
	}
	
	private static List<Person> createPersonList() {
		return Arrays.asList(new Person("Prassanna", Gender.MALE, 29), new Person("Jayashree", Gender.FEMALE, 29),
				new Person("Kiruba", Gender.FEMALE, 1), new Person("Krisha", Gender.FEMALE, 1)

		);
	}

}
