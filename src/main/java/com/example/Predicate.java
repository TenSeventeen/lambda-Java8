package com.example;

import java.util.ArrayList;
import java.util.List;

public class Predicate<T> {
	private static List<Person> findMathPerson(List<Person> people, Ipredicate<Person> predicate) {
		List<Person> list = new ArrayList<>();
		for (Person person : people) {
			if (predicate.test(person)) {
				list.add(person);
			}
		}
		return list;
	}

	public static void main(String[] args) {
		List<Person> people = new ArrayList<>();
		for (int i = 1; i < 20; i++) {
			Person person = new Person(1 + i, "john", 1000.00 * i);
			people.add(person);
		}
		List<Person> lp  = findMathPerson(people, p -> p.getId() == 4);
		List<Person> lp1 = findMathPerson(people, p -> p.getName() == "john");
		List<Person> lp2 = findMathPerson(people, p -> p.getSalary() == 5000.0);
		System.out.println(lp);
		System.out.println(lp1);
		System.out.println(lp2);
	}

}
