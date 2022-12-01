package com.masai.assignment.day11.q1;

public class Demo {

	public static void main(String[] args) {
		 // TODO Auto-generated method stub
		StudentBean s1=new StudentBean(85,560,"raghuDum");
		StudentBean s2=new StudentBean(1,200,"raghu");
		System.out.println(s1);
		System.out.println(s2);
	}	

}
class StudentBean{
	private int roll;
	
	private int marks;
    private String name;
    private char grade;
    
    StudentBean(int rol,int mark,String name){
    	this.roll=rol;
    	this.name=name;
    	this.marks=mark;
    	calculateGrade(mark);
    }
    
   private char calculateGrade(int mark) {
	   if(mark>=500) {
		   this.grade='A';
	   }
	   else if(marks<500 && marks>=400) {
		   this.grade='B';
	   }
	   else {
		   this.grade='C';
	   }
	   return this.grade;
   }
   
	@Override
	public String toString() {
		return "StudentBean [roll=" + roll + ", marks=" + marks + ", name=" + name + ", grade=" + grade + "]";
	}
}
