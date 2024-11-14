package practice;

import java.util.Scanner;

public class InputDetails {
    public static void main(String[] args) {

        Staff info = new Staff();

        Scanner employee = new Scanner(System.in);

        System.out.println("Name ");
        info.name = employee.next();
        info.name = info.name + employee.nextLine();

        System.out.println("Job Title ");
        info.jobTitle = employee.next();

        System.out.println("Address ");
        info.Address = employee.next();

        System.out.println("Phone Number ");
        info.phoneNumber = employee.nextLong();

        System.out.println("Salary ");
        info.salary = employee.nextLong();

        System.out.println("Increment ");
        info.increment = employee.nextDouble();

        info.details();


    }



}
