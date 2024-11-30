package WAP.practice;

import java.util.Scanner;

public class MainLoan {
    public static void main(String[] args) {
        LoanEligibility requirements = new LoanEligibility();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the age : ");
        requirements.age = scanner.nextInt();

        System.out.println("Enter the yearly income $ : ");
        requirements.yearlyIncome = scanner.nextLong();

        System.out.println("Enter the credit score : ");
        requirements.creditScore = scanner.nextInt();
        System.out.println();
        requirements.loanEligibility();

    }
}
