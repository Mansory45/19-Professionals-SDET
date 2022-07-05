package com.syntax.class26;

import java.util.ArrayList;

public class Demo1 {
    public static void main(String[] args) {
        String name = "Aladin";
        String name2 = "Aimal";
        String name3 = "Arif";

       /*int size =10;
        String[] arr = new String[size];*/
        String[] names ={"Aladin","Aimal","Arif"};
        System.out.println(name.length());
        names = new String[4];
        names[0]="Aladin";
        names[1]="AImal";
        names[2]="Arif";
        names[3]="Naweed";
        System.out.println(name.length());


        ArrayList<String> syntaxStudent = new ArrayList<>();
        System.out.println(syntaxStudent.size());
        syntaxStudent.add("Aimal");
        System.out.println(syntaxStudent.size());
        syntaxStudent.add("Karla james bond");
        System.out.println("Ivan 004");
        System.out.println(syntaxStudent.size());

        ArrayList<Integer> number = new ArrayList<>();
       for (int i =1; i<10;i=i+2){
           number.add(i);
       }
        System.out.println(number);

    }
}
