package Practice;

import java.util.Scanner;

public class Problem29 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter first number");
        int x = scan.nextInt();

        System.out.println("Please enter second number");
        int y = scan.nextInt();

        if (x * y >0){
            System.out.println("true");
        }else {
            System.out.println("false");
        }
    }
}
