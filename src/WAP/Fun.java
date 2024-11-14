package WAP;

import java.util.Scanner;

public class Fun {
    public static void main(String[] args) {

        Scanner Student = new Scanner(System.in);
        System.out.println("What is your first name?");
        String Name = Student.next();

        System.out.println("Your age?");
        int age = Student.nextInt();

        System.out.println("Your height?");
        float height = Student.nextFloat();

        System.out.println("Your salary?");
        long salary = Student.nextLong();

        System.out.println("Your favourite food?");
        String food = Student.next();
       food = food + Student.nextLine();

        System.out.println("Hello, Miss." + Name + ",you are " + age + " years old.");
        System.out.println("Your height is " + height + "ft.");
        System.out.println("Your salary is " + salary);
        System.out.println("Your favourite food is " + food );
        System.out.println("It's nice to talk with you Miss." + Name );
        System.out.println("Have a great day.");

    }
}
