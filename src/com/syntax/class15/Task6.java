package com.syntax.class15;

public class Task6 {
    // Write a method to return whether given number is prime or not?
    boolean isPrime(int x ){
        boolean isPrime = true;
        if (x>1){
            for (int i =2; i < x;i++){
                if (x%i==0){
                    isPrime = false;
                    break;
                }
            }
        }else {
            isPrime = false;
        }
        return isPrime;
    }

    public static void main(String[] args) {

        Task6 task6 = new Task6();
        System.out.println(task6.isPrime(17));
    }
}
