package WAP;

import java.util.Scanner;

public class TestingScanner {
    public static void main(String[] args) {

        Scanner Info = new Scanner(System.in);

        System.out.println("What's your first name?");
        String name = Info.next();

        System.out.println("What's your age?");
        int age = Info.nextInt();

        System.out.println("Where do you live?");
        String address = Info.next();

        System.out.println("What is your quote?");
        String quote = Info.next();
        quote = quote + Info.nextLine();

        System.out.println("Thank you " + name + ",you are " + age + " years old.");
        System.out.println("Your quote is " + quote);

        System.out.println("You are awesome, it's nice meeting you." );



    }
}
