package WAP.practice.hierarchical;

public class Main {
    public static void main(String[] args) {

        Vehicle bike = new Bike();
        Vehicle car = new Car();

        System.out.println("Bike details: ");
        bike.model();
        bike.Color();

        System.out.println("Car details: ");
        car.model();
        car.Color();

    }
}
