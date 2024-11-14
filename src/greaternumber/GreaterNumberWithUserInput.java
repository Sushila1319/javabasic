package greaternumber;


import java.util.Scanner;

public class GreaterNumberWithUserInput {
    public static void main(String[] args) {
      // int a = 10;
       Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number ");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter second number ");
        int secondNumber = scanner.nextInt();
        if (firstNumber > secondNumber) {
            System.out.println(" The greater number is " + firstNumber);
        } else {
            System.out.println( "The greater number is " + secondNumber);
        }

    }


}
