package Practice;

import java.util.Scanner;

public class Problem31 {
    public static void main(String[] args) {
        boolean isSunny;
        int temperature;
        Scanner scan = new Scanner(System.in);
        System.out.println("Is it sunny outside?");
        isSunny = scan.nextBoolean();

        if (isSunny){
            System.out.println("It is a sunny day, I should go someWhere!");
            System.out.println("What is the temperature outside?");
            temperature = scan.nextInt();
            if (temperature>85){
                System.out.println("I am going to the beach");
            }else {
                System.out.println("I am going to the park");
            }
        }else {
            System.out.println("I stay home and practice Java");
        }

    }
}
