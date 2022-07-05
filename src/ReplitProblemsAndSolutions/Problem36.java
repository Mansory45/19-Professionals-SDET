package ReplitProblemsAndSolutions;

import java.util.Scanner;

public class Problem36 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter two strings");
        String string1 = scan.nextLine();
        String string2 = scan.nextLine();
        System.out.println("Please enter two number");
        int number1 = scan.nextInt();
        int number2 = scan.nextInt();
        String out;
        if (string1.equals(string2)&&number1==number2){
            out = "AND";
        } else if (string1.equals(string2) || number1==number2) {
            out = "OR";
        } else {
                out = " NONE";
            }
            System.out.println(out);
        }
    }

