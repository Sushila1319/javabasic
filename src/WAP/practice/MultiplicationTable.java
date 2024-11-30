package WAP.practice;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner user = new Scanner (System.in);
        System.out.println("Enter the number : ");
        int number = user.nextInt();

        for(int i=1; i<=10; i++)
            System.out.println(number + " * " + i + " = " + (number * i) );

    }
}
