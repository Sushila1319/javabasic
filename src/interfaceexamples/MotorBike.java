package interfaceexamples;

public class MotorBike implements Vehicle {
    @Override
    public void start(){
        System.out.println("Motorbike is Starting...");
    }

    @Override
    public void stop(){
        System.out.println("Motorbike is Stopping...");
    }

}
