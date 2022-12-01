

/*Explain the difference between overloading and overriding methods with an example?

Method Overloading: 
 Method Overloading is an example of Compile time polymorphism.
 In this, more than one method of the same class shares the same method name having different signatures. 
 Method overloading is used to add more to the behavior of methods and there is no need of more than one class for method overloading.

 example*/


package com.masai.assignment.day9.q4;


import java.io.*;

class MethodOverloadingEx {

    static int add(int a, int b)
    {
      return a + b;
    }

    static int add(int a, int b, int c)
    {
        return a + b + c;
    }

    public static void main(String args[])
    {
          System.out.println("add() with 2 parameters");
        System.out.println(add(4, 6));

          System.out.println("add() with 3 parameters");
        System.out.println(add(4, 6, 7));
    }
}

/*-------------------------------------------------------------------------------------------------------------

Method Overriding is a Run time polymorphism. 
In method overriding, the derived class provides the specific implementation 
of the method that is already provided by the base class or parent class. In method overriding, 
the return type must be the same or co-variant (return type may vary in the same direction as the derived class). 
example:
--------------------------------------------------------------------------------*/
import java.io.*;

class Animal {

    void eat()
    {
        System.out.println("eat() method of base class");
        System.out.println("eating.");
    }
}

class Dog extends Animal {

    void eat()
    {
        System.out.println("eat() method of derived class");
        System.out.println("Dog is eating.");
    }
}

class MethodOverridingEx {

    public static void main(String args[])
    {
        Dog d1 = new Dog();
        Animal a1 = new Animal();

        d1.eat();
        a1.eat();

        Animal animal = new Dog();
        // eat() method of animal class is overridden by
        // base class eat()
        animal.eat();
    }
}