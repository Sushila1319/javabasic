package inheritance.hierarchicalinhertitance;

public class Circle extends Shape {

    @Override
    public void draw(){
        System.out.println("Drawing a circle.");
    }

    public void area(){
        System.out.println("Area of circle: " );
    }
}
