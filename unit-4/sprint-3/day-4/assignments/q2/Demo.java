package com.masai.assignment.day11.q2;




public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c=new Child(11);
		c.method1();
		c.method2();
		c.method3();
		c.method4();

	}

}

class Parent{
	int number;
	
	void method1(){
		System.out.println("Base-class method-1 is running");
	};
	void method2(){
		System.out.println("Base-class method-2 is running");
	};
	void method3(){
		System.out.println("Base-class method-3 is running");
	};
	
}


	class Child extends Parent{
	
	Child(int num){
	if(num>=1 && num<=10) {	
		super.number=num;
	}
	}
	void method1() {
		System.out.println("sub-class method-1 is running");
		if(number==0) {
			System.out.println("Invalid number you passed");
		}
		else {
			System.out.println("Number is"+" "+number);
		}
	}
	void method4() {
		System.out.println("sub-class method-4 is running");
	}
}