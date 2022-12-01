package com.masai.assignment.day3.Q3;


import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

public class Demo {

	public Map<String, Student> sortMapUsingStudentName(Map<String, Student> originalMap){
		
		Comparator<Map.Entry<String, Student>> namesComp = ( Map.Entry<String, Student> m1 ,Map.Entry<String, Student> m2 ) -> {
			return m2.getValue().getName().compareTo(m1.getValue().getName());
		};
		
		Set<Map.Entry<String, Student>> set = originalMap.entrySet();
		
		TreeSet<Map.Entry<String, Student>> ts = new TreeSet<>(namesComp);
		
		ts.addAll(set);
		
		LinkedHashMap<String, Student> lhs = new LinkedHashMap<>();
		
		for(Map.Entry<String, Student> i:ts) {
			lhs.put(i.getKey(), i.getValue());
		}
		
		return lhs;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, Student> hm = new HashMap<>();
		
		hm.put("india", new Student(12, "N1", 700));
		hm.put("UK", new Student(14, "N2", 600));
		hm.put("USA", new Student(13, "N3", 500));
		hm.put("NZ", new Student(15, "N4", 400));
		hm.put("SA", new Student(19, "N5", 300));
		
		Demo d1 = new Demo();
		
		Map<String, Student> map = d1.sortMapUsingStudentName(hm);
		
		Set<Map.Entry<String, Student>> set = map.entrySet();
		
		for(Map.Entry<String, Student> i:set) {
			
			System.out.println("Country : "+i.getKey());
			System.out.println("Roll No : "+i.getValue().getRoll());
			System.out.println("Name : "+i.getValue().getName());
			System.out.println("Marks : "+i.getValue().getMarks());
			
			System.out.println("********************************");
		}
	}

}
