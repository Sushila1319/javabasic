package WAP;
import java.util.Scanner;
public class SumMultiByUser {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.println( "Enter the first number ");
        int firstNumber = Input.nextInt();
        System.out.println( "Enter the second number ");
        int secondNumber = Input.nextInt();
        System.out.println("The sum of two numbers is " + (firstNumber + secondNumber));
        System.out.println("The product of two number is " + (firstNumber * secondNumber));
    }
}
