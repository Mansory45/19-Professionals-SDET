package ReplitProblemsAndSolutions;

import java.util.Scanner;

public class Problem34 {
    public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
        System.out.println("Please enter 3 distinct number");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();

        if (num1> num2){
            if(num1> num3){
                System.out.println("The larges number is " + num1);
            }else {
                System.out.println("The largest number is " + num2);
        }
        }else {
            if ( num2 > num3){
                System.out.println("The larges number is " + num2);
            }else{
                System.out.println("The largest number is " + num3);
            }
        }
    }
}
