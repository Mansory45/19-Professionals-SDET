package com.syntax.class16;

public class GoogleEmployee {
    String name;
    double salary;
   static int noOfEmployees;
    static String companyName = "Google";

    void displayEmployeeInfo(){
        System.out.println("Name "+name+ salary+ companyName+ " Total Employee"+ noOfEmployees);
    }

    public static void main(String[] args) {
        GoogleEmployee emp1=new GoogleEmployee();
        emp1.name = "Aimal ";
        emp1.salary = 25000;
        emp1.noOfEmployees = 1;


        GoogleEmployee emp2=new GoogleEmployee();
        emp2.name = "Sameer ";
        emp2.salary = 250001;
        emp2.noOfEmployees = 2;
        emp1.displayEmployeeInfo();
        emp2.displayEmployeeInfo();

    }
}
