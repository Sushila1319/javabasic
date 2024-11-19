package WAP;

import java.util.Scanner;

public class EvenNumberOutput {
    public static void main(String[] args) {
        EvenNumber evenNumber = new EvenNumber();

        Scanner even = new Scanner(System.in);
        System.out.println("Enter first number: ");
        evenNumber.firstNumber = even.nextInt();

        System.out.println("Enter second number: ");
        evenNumber.secondNumber = even.nextInt();

        evenNumber.number();

    }
}
