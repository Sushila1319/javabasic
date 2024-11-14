package practice;

import java.util.Scanner;

public class EmployeeUserInput {
    public static void main(String[] args) {
        Employee staff = new Employee();

        Scanner details = new Scanner(System.in);
        System.out.println("Staff name");
        staff.name = details.next();

        System.out.println("Staff address");
        staff.address = details.next();

        System.out.println("Staff salary");
        staff.salary = details.nextInt();

        System.out.println("Staff job title");
        staff.jobTitle = details.next();

        System.out.println("Previous salary");
        staff.lastYearSalary = details.nextInt();

        staff.allInfo();

    }
}
