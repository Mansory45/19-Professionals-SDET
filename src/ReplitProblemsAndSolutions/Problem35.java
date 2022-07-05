package ReplitProblemsAndSolutions;

import java.util.Scanner;

public class Problem35 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Do you need a loan?");
        boolean isLoanRequire = scan.nextBoolean();
        int creditScore;
        String out;
        if (isLoanRequire){
            System.out.println("What is your cridet Score");
            creditScore= scan.nextInt();
            if (creditScore<600){
                out = "The eligibility is Not eligible";
            }else if (creditScore<=700){
                out ="The eligiblity is Maybe eligible";
            }else if (creditScore<= 800){
                out = "The eligiblity is Eligible";
            }else {
                out = "The eligiblity is Definitely eligible";
            }
        }else {
            out = "Unknown";
        }
    }
}
