package com.prassannas.java8.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.prassannas.java8.data.Gender;
import com.prassannas.java8.data.Person;

public class StreamSession1 {

	public static void main(String[] args) {
		List<Person> personList = createPersonList();

		List<String> filteredList = new ArrayList<String>();

		// Using Java 7
		printingAllFemalesUsingJava7(personList, filteredList);

		Person p1 = personList.stream().filter(person -> person.getGender().equals(Gender.BYPASS)).findFirst()
				.orElse(null);
		System.out.println(p1);

	}

	private static List<Person> createPersonList() {
		return Arrays.asList(new Person("Prassanna", Gender.MALE, 29), new Person("Jayashree", Gender.FEMALE, 29),
				new Person("Kiruba", Gender.FEMALE, 1), new Person("Krisha", Gender.FEMALE, 1)

		);
	}

	private static void printingAllFemalesUsingJava7(List<Person> personList, List<String> filteredList) {
		for (Person person : personList) {
			if (person.getGender().equals(Gender.FEMALE)) {
				filteredList.add(person.getName().toUpperCase());
			}
		}

		System.out.println(filteredList);
	}

}
