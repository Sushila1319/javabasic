package practice;

public class Apartment {

    String name;
    String address;
    int rent;
    int waterBill;
    int electricityBill;

    public void expenses() {
        System.out.println("Apartment name : " + name  );
        System.out.println("Expenses in rent : " + rent);
        System.out.println("Address : " + address);
        System.out.println("Expenses in water bill : " + waterBill);
        System.out.println("Expenses in electricity bill : " + electricityBill);
        System.out.println("Total expenses : $" + (rent + waterBill + electricityBill));
    }

}

