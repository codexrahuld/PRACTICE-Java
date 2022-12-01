package com.masai.question1;

public class Problem_1 {
    public static void main(String[] args) {
        Employee p1 = new PermanentEmployee(1222,"Sham");
        p1.salary=12000.50;
        Employee t1 = new TemporaryEmployee(1444,"Chetan");
        t1.salary = 50000.00;
        Loan calculate = new Loan();
        double amt;
        amt = calculate.calculateLoanAmount(p1);
        if(amt==0){
            System.out.println("Error");
        } else{
            System.out.println(amt);
        }
        
        
        amt = calculate.calculateLoanAmount(t1);
        if(amt==0){
            System.out.println("Error");
        } else{
            System.out.println(amt);
        }
        amt = calculate.calculateLoanAmount(null);
        if(amt==0){
            System.out.println("Error");
        } else{
            System.out.println(amt);
        }

    }
}


abstract class Employee{
     int employeeId;
     String employeeName;
     double salary;
     public Employee(int employeeId, String employeeName){
         this.employeeId=employeeId;
         this.employeeName=employeeName;
     }
     abstract void calculateSalary();
}


class PermanentEmployee extends Employee{
    private double basicPay;
    double PF_amount = basicPay*0.12;

    public PermanentEmployee(int employeeId, String employeeName) {
        super(employeeId, employeeName);
    }

    void PermanentEmployee(int employeeId, String employeeName, double basicPay){
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.basicPay = basicPay;
    }

    @Override
    void calculateSalary() {
        salary = basicPay - PF_amount;

    }
}

class TemporaryEmployee extends Employee{
    private int hoursWorked;
    private int hourlyWages;

    public TemporaryEmployee(int employeeId, String employeeName) {
        super(employeeId, employeeName);
    }
    void TemporaryEmployee(int employeeId, String employeeName,int hoursWorked, int hourlyWages){
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.hoursWorked = hoursWorked;
        this.hourlyWages = hourlyWages;
    }
    @Override
    void calculateSalary () {
        salary = hoursWorked*hourlyWages;
    }
}


class Loan{
    double loan_amount;
    public double calculateLoanAmount(Employee employeeObj){
        if(employeeObj instanceof PermanentEmployee){
            double salary = employeeObj.salary;
            loan_amount = salary*15/100;
        } else if(employeeObj instanceof TemporaryEmployee){
            double salary = employeeObj.salary;
            loan_amount = salary*10/100;
        } else if(employeeObj == null){
            loan_amount = 0;
        }
        return loan_amount;
    }
}
