package com.prassannas.java8.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import com.prassannas.java8.data.Gender;
import com.prassannas.java8.data.Person;

public class LambdaCustomFunctionalInterfaces {

	public static void main(String[] args) {
		List<Person> personList = createPersonList();

		// print All the Names
		System.out.println("---");
		
		// Practice Lambda
		printNames(personList, person -> person.getGender().equals(Gender.FEMALE),
				person -> System.out.println(person.getAge()));

	}

	private static List<Person> createPersonList() {
		return Arrays.asList(new Person("Prassanna", Gender.MALE, 29), new Person("Jayashree", Gender.FEMALE, 29),
				new Person("Kiruba", Gender.FEMALE, 1), new Person("Krisha", Gender.FEMALE, 1)

		);
	}

	private static void printNames(List<Person> personList, Predicate<Person> predicate, Consumer<Person> consumer) {
		for (Person p : personList) {
			if (predicate.test(p))
				consumer.accept(p);
		}
	}

}
