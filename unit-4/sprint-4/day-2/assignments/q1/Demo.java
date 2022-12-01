package com.masai.assignment.day12.q1;


public class Demo {

public static void main(String[] args) {
    ZImpl obj=new ZImpl();
    obj.abstractMethod1();
    obj.defaultMethod1();
    
    obj.abstractMethod2();
    obj.defaultMethod2();
    
    obj.abstractMethod3();
    
    //we can call static method of interface directly using interface.
    
    Int1.staticMethod1();
    
    Int2.staticMethod2();
    

}

}

interface Int1{
void abstractMethod1();

default void defaultMethod1() {
	System.out.println("Interface-1 default method");
}

static void staticMethod1() {
	System.out.println("Interface-1 static method");
}	
}

interface Int2{
void abstractMethod2();

default void defaultMethod2() {
	System.out.println("Interface-2 default method");
}

static void staticMethod2() {
	System.out.println("Interface-2 static method");
}
}

interface Int3 extends Int1,Int2{
void abstractMethod3();
}

class ZImpl implements Int3{

@Override
public void abstractMethod1() {
	System.out.println("Interface-1 abstractMethod1 overriden");
}

@Override
public void defaultMethod1(){
	System.out.println("Interface-1 defaultMethod1 overriden");
	
}

@Override
public void abstractMethod2() {
	System.out.println("Interface-2 abstractMethod2 overriden");
}

@Override
public void abstractMethod3() {
	System.out.println("Interface-3 abstractMethod3 overriden");
}


}
