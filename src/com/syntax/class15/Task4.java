package com.syntax.class15;

import java.util.Locale;

public class Task4 {
    // Create a method that will say Hello in different
    // Language based on the country that will passed when method is executed .
    void sayHello(String country){
        String hello;
        country=country.toLowerCase();
        switch (country){
            case "usa":
                hello = "hello";
                break;
            case "afghanistan":
                hello = "Salam";
                break;
            case "russia":
                hello = "Privet";
                break;
            case "france":
                hello = "bonjour";
                break;
            case "india":
                hello = " Namastay";
                break;
            default:
                hello = "Invalide country";

        }
        System.out.println(hello);
    }



    public static void main(String[] args) {

        Task4 task4 = new Task4();
        task4.sayHello("USA");

    }
}
