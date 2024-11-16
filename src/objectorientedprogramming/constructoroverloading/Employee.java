package objectorientedprogramming.constructoroverloading;

public class Employee {
    Integer id;
    String name;
    String department;

    //default constructor
    public Employee() {
        this.id = 0;
        this.name = "UnKnown Employee";
        this.department = "Not Assigned";
    }

    //constructor overloaded with only ID
    public Employee(Integer id) {
        this.id = id;
        this.name = "UnKnown Employee";
        this.department = "Not Assigned";
    }

    //constructor overloaded with only ID and name
    public Employee(Integer id, String name) {
        this.id = id;
        this.name = "UnKnown Employee";
        this.department = "Not Assigned";
    }

    public Employee(Integer id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }




    public void displayDetails() {
        System.out.println("ID:" + id);
        System.out.println("Name:" + name);
        System.out.println("Department:" + department);

    }

    public static void main(String[] args) {

        Employee emp1 = new Employee();
        emp1.displayDetails();
        System.out.println();

        Employee emp2 = new Employee(101);
        emp2.displayDetails();
        System.out.println();

        Employee emp3 = new Employee(102, "John Doe");
        emp3.displayDetails();
        System.out.println();

        Employee emp4 = new Employee(1, "John Doe", "IT");
        emp4.displayDetails();
        System.out.println();




    }


}

