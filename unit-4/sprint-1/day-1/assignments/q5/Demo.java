
//5) Write the java program to calculate the factorial of number.
//Ans:- 


package com.masai.assignment.day1.q5;

public class Demo {

public static void main(String[] args) {

        int num = 10;
        long factorial = 1;
        for(int i = 1; i <= num; ++i)
        {
            // factorial = factorial * i;
            factorial *= i;
        }
        System.out.printf("Factorial of %d = %d", num, factorial);
    }
}