package objectorientedprogramming.objectclass;

public class EvMain {
    public static void main(String[] args) {

        ElectricVehicle electricVehicle = new ElectricVehicle();
        electricVehicle.brand = "Kia"; // value initialize
        electricVehicle.vin = 123567; // value initialize

        electricVehicle.printBrand(); // method invoke or calling
        electricVehicle.printVin(); // method invoke or calling
    }
}