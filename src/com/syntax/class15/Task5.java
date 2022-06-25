package com.syntax.class15;

import java.util.Stack;

public class Task5 {
    /*
    Create a method createEmail(). Based on values of users name lastName and emailtype,
    your method should returen complete email address . Example: crateEmail(john snow gmail) --> johnsnow@gmail.com
     */
    String completeEmail(String firstName, String lastName, String emailType) {
        return firstName+lastName+"@"+emailType+".com";
    }


    public static void main(String[] args) {

        Task5 task5 = new Task5();
        System.out.println(task5.completeEmail("Aimal","mansory","gmail"));
    }
}