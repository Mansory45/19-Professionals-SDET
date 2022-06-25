package com.syntax.class17;

import com.syntax.class16 .Dog;

public class Tester {
    public static void main(String[] args) {
      /* if classes exist inside the same package they are imported automatcaiully
     */
    Employee employee = new Employee();
    employee.name="Mike";
    employee.department = "IT saver";
    //employee.printSalary(); privet we can't access it
        employee.printDepartment();
    Dog dog = new Dog();

    }
}
