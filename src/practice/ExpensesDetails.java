package practice;

import java.sql.SQLOutput;

public class ExpensesDetails {
    public static void main(String[] args) {

        Apartment expenses = new Apartment();
                expenses.name = "Station";
                expenses.address = "Hurst";
                expenses.waterBill = 100;
                expenses.electricityBill = 45;
                expenses.rent = 1500;


        expenses.expenses();

    }
}
