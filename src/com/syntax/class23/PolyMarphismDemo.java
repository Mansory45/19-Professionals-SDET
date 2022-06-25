package com.syntax.class23;

public class PolyMarphismDemo {
    void doSomething(String naem){
        System.out.println("downloading a movie form the internet");
    }
    void doSomething(int num){
        System.out.println("calcuating the tex based on new rules");
    }
}
class polyTester{
    public static void main(String[] args) {
        PolyMarphismDemo p = new PolyMarphismDemo();
        p.doSomething(10);
    }
}