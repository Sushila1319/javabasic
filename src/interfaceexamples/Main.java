package interfaceexamples;

public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car();
        car.start();
        car.stop();

        Vehicle motorBike = new MotorBike();
        motorBike.start();
        motorBike.stop();
    }
}



