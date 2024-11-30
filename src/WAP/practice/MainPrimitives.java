package WAP.practice;

import java.util.Scanner;

public class MainPrimitives {
    public static void main(String[] args) {
        AllPrimitives result = new AllPrimitives();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name:");
        result.name = scanner.next();
        result.name = scanner.nextLine();

        System.out.println("Enter the age:");
        result.age = scanner.nextInt();

        System.out.println("Enter the height:");
        result.height = scanner.nextFloat();

        System.out.println("Enter the address:");
        result.address = scanner.next();
        result.address=scanner.nextLine();

        System.out.println("Enter the job:");
        result.job = scanner.next();

        System.out.println("Enter the current salary:");
        result.salary = scanner.nextLong();

        System.out.println("Enter the increment amount:");
        result.increment = scanner.nextShort();

        result.primitive();



    }


}
