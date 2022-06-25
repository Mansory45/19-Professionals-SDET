package Practice;

import java.util.Scanner;

public class Problem20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your first Name?");
        String firstName = scan.next();
        System.out.println("What is your last Name?");
        String lastName = scan.next();
        System.out.println(firstName+ " "+ lastName);
    }
}
