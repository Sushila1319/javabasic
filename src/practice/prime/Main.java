package practice.prime;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CheckPrime check = new CheckPrime();
        Scanner find = new Scanner(System.in);
        System.out.println("Enter the number: ");
        check.number= find.nextInt();
        check.prime();

    }
}
