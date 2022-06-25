package Practice;

import java.util.Scanner;

public class Problem25 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("in:");
        int num = scan.nextInt();

        if (num > 0){
            System.out.println(num + " is positive");
        }else if (num<0){
            System.out.println(num+" is negative");
        }else {
            System.out.println("Entered number is equals to 0");
        }
    }
}
