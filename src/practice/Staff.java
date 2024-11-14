package practice;

public class Staff {
    String name;
    String jobTitle;
    String Address;
    long phoneNumber;
    long salary;
    double increment;
    double newSalary;

    public void details() {
        newSalary = .01*increment * salary + salary;
        System.out.println("Employee Details : ");
        System.out.println("Name : " + name );
        System.out.println("Job Title : " + jobTitle);
        System.out.println("Address : " + Address) ;
        System.out.println("Phone Number : " + phoneNumber);
        System.out.println("Salary : $ " + salary);
        System.out.println("Increment : " + increment + "%");
        System.out.println("New Salary : $ " + newSalary);


    }



}
