package objectorientedprogramming.objectclass;
import java.util.Scanner;

public class otherUser {
    public static void main(String[] args) {
        ElectricVehicle name = new  ElectricVehicle();
        Scanner info = new Scanner(System.in);
        System.out.println("Input the brand name : ");
        name.brand= info.next();
        System.out.println("Input the vin no : ");
        name.vin=info.nextLong();
        name.printBrand();
        name.printVin();
    }
}
