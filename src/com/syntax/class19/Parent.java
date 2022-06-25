package com.syntax.class19;

public class Parent {
    String name = "Mansory";
    double money = 1000000;

}
class Child extends Parent{
    void printInfo(){
        System.out.println("My full name is Aimal "+name);
    }
    void byCar(){
        System.out.println("Hehehhe buing car form dady money "+money);
    }
}
class Tester{
    public static void main(String[] args) {
        Child child = new Child();
        child.printInfo();

    }
}