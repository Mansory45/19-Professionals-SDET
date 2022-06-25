package Practice;

import java.util.Scanner;

public class Problem32 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char gender;
        int age;
        System.out.println("Please enter your gender:M or F");
        gender = scan.next().charAt(0);
        System.out.println("Pleaes enter your age");
        age = scan.nextInt();
        if (age>25){
            if (gender=='F'){
                System.out.println("Women");
            }else {
                System.out.println("Man");
            }
        }else {
            if (gender == 'F'){
                System.out.println("Girl");
            }else {
                System.out.println("Boy");
            }
        }

    }
}
