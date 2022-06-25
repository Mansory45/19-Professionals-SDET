package com.syntax.class15;

public class Task2 {

        void printEvenOdd(int number){
            if(number %2==0){
                System.out.println("number is Even");
            }else {
                System.out.println("number is Odd");
            }
        }

    public static void main(String[] args) {
        //Create a method that will take a number and print weather the number is even or odd.T

        Task2 task2 = new Task2();
        task2.printEvenOdd(15);
    }
}
