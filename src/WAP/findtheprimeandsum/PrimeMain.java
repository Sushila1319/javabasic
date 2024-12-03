package WAP.findtheprimeandsum;

import java.util.Scanner;

public class PrimeMain {
    public static void main(String[] args) {
        FindPrime prime = new FindPrime();

        Scanner find = new Scanner(System.in);
        System.out.println("Enter the number : ");
        prime.number = find.nextInt();
        prime.checkPrime();


    }
}
