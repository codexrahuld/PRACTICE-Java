package com.masai.C1.Question1;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// using Lambda expression
		
		System.out.println("predicate :");
		
		Predicate<Student> PS = s -> s.getMarks() > 500;
		
		System.out.println(PS.test(new Student(12, "Rahul", 600)));
		
		System.out.println("********");
		
		
		System.out.println("Consumer :");
		
		Consumer<Student> CS = s -> System.out.println(s);
		
		CS.accept(new Student(12, "Rahul", 600));
		
		System.out.println("*******");
		
		
		System.out.println("Supplier :");
		
		Supplier<Student> SS = () -> {
			return new Student(12, "Rahul", 600);
		};
		
		
		System.out.println(SS.get());
		
		System.out.println("********");
		
		System.out.println("Function :");
		
		Function<String, Integer> FS = s -> Integer.parseInt(s);
		
		System.out.println(FS.apply("10")/2);
		
		System.out.println("*****************");
	}

}