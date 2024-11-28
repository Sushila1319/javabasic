package inheritance.singleinheritance;

public class Main {
    public static void main(String[] args) {
       // Employee managerEmployee = new Manager();
        Manager manager = new Manager("John", 80000, 10);
        manager.displayDetails();
    }
}
