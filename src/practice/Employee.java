package practice;

public class Employee {
    String name;
    String address;
    String jobTitle;
    int salary;
    int lastYearSalary;
    public void allInfo() {
        System.out.println("Staff name :  " + name);
        System.out.println("Staff address : " + address);
        System.out.println("Job title :" + jobTitle );
        System.out.println("Current salary :  " + salary);
        System.out.printf("Previous salary : " + lastYearSalary);
        if (salary>lastYearSalary) {
            System.out.println("You are awesome!!");
        } else {
            System.out.println("Try hard!!");
        }

    }
}
