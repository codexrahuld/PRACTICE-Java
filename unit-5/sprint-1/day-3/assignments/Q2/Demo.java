package com.masai.assignment.day3.Q2;


import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list = Arrays.asList("mumbai","delhi","pune","kolkata");
		
		Predicate<String> p = (String s) -> {
			return s.equalsIgnoreCase("mumbai") ? true : false;
		};
		
		System.out.println(p.test("mumbai"));
		
		Consumer<String> c = (String s) -> {
			
			System.out.println(Integer.parseInt(s));
		};
		
		c.accept("15");
		
		Supplier<String> s = () -> {
			return "this message is from lambda expression";
		};
		
		System.out.println(s.get());
	
		Function<List<String>, Integer> f = (List<String> l) -> {
			return l.size();
		};
	
		System.out.println(f.apply(list));
	}

}
