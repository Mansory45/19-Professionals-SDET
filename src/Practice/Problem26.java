package Practice;

import java.util.Scanner;

public class Problem26 {
    public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
        System.out.println("In:");
        String name = scan.nextLine();
        if (name.equalsIgnoreCase("Chen")){
            System.out.println("Teacher");
        }else {
            System.out.println("Student");
        }

    }
}
