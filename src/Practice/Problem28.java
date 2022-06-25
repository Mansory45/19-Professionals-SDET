package Practice;

import java.util.Scanner;

public class Problem28 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the length");
        int length = scan.nextInt();
        System.out.println("Please enter the width");
        int width = scan.nextInt();
        if (length != width){
            System.out.println("The shape of your object is rectangle");
        }else {
            System.out.println("The shape of your object is square");
        }
    }
}
