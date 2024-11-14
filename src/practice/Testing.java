package practice;

import java.util.Scanner;

public class Testing {
    public void Swapping(){
        Scanner work = new Scanner(System.in);
        System.out.println("First Number : ");
        int firstNumber = work.nextInt();

        System.out.println("Second Number : ");
        int secondNumber = work.nextInt();

        System.out.println("before swapping : First number = " + firstNumber + "Second number = " + secondNumber);

        int extra = firstNumber;
       firstNumber = secondNumber;
       secondNumber= extra;

        System.out.println("After swapping : First number = " + firstNumber + "Second number = " + secondNumber);
    }
}
