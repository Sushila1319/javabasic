package primenumber;

import java.util.Scanner;

public class MainNewPrime {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = scanner.nextInt();
        PrimeNew check = new PrimeNew();
        check.isPrimeNumber(number);

        boolean isPrimeNumber = check.isPrime(number);
        if (isPrimeNumber) {
            System.out.println("The number is a prime number.");
        } else {
            System.out.println("The number is not a prime number.");
        }
        check.checkPrimeWithDivisionCount(number);
    }
}
