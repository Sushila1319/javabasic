package WAP;
import java.util.Scanner;
public class Work {
    public static void main(String[] args) {
     Scanner Market = new Scanner(System.in);
        System.out.println("Enter the first number ");
        int first = Market.nextInt();
        System.out.println("Enter the second number ");
    int second = Market.nextInt();

        System.out.println("Enter the third number ");
        int third = Market.nextInt();

    if (first > second)
        {
            System.out.println("The smaller number is " + first);
        }else{
            System.out.println("The greater number is " + second);
        }
            System.out.println("The sum of two number is " + (first + second));
            System.out.println("The product of numbers is " + (first*second*third));
        System.out.println("The division of numbers is " + ((first+second)/third));


    }
}
