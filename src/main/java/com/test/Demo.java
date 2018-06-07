package com.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

import com.example.Car;
import com.example.Person;


public class Demo {
	
	public static<T> double mapSum(List<T> entities,Function<T,Double> f) {
    	int sum=0;
    	for(T entity:entities) {
    	    sum += f.apply(entity);	
    	}
		return sum;
    }

	public static void main(String[] args) {
	  List<Person> people = new ArrayList<>();
	  Person person = new Person(1, "john", 1000.0);
	  people.add(person);
      System.out.println(mapSum(people, Person::getSalary));
      
      List<Car> cars = new ArrayList<>();
      Car car = new Car("雪佛兰","SUV",432888.8);
      Car car1 = new Car("吉普","越野",778888.8);
      cars.add(car);
      cars.add(car1);
      System.out.println(mapSum(cars,Car::getPrice));
	}
}
