package practice.prime;

import java.util.Scanner;

public class CheckPrime {
    int number;

    public void prime() {
        boolean isPrime=true;
        if (number<=1){
            isPrime=false;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime=false;
            }
        }
        if (isPrime)
        System.out.println("The number "+number+" is a prime number.");
        else
            System.out.println("The number "+number+" is not a prime number.");


    }
}