package com.masai.Eval2.Q5;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class Demo2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		FileInputStream fis = new FileInputStream("studentdata.txt");
		
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		List<Student> students = (List<Student>)ois.readObject();
		
		students.forEach(s -> System.out.println(s));
		
		// adding
		
		FileOutputStream fos = new FileOutputStream("studentdata.txt");
		
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		students.add(new Student(1, "N1", 100, "n1.com", "N1xyz", new Address("Delhi", "delhi", "101001")));
		oos.writeObject(students);
		
		System.out.println("********");
		
		FileInputStream fis2 = new FileInputStream("studentdata.txt");
		
		ObjectInputStream ois2 = new ObjectInputStream(fis2);
		
		List<Student> students2 = (List<Student>)ois2.readObject();
		
		students2.forEach(s2 -> System.out.println(s2));
		
		
	}
	

}