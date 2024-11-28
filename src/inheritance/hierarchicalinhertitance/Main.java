package inheritance.hierarchicalinhertitance;

public class Main {
    public static void main(String[] args) {
        Circle circleShape = new Circle();
       // Rectangle rect = new Rectangle();
      //type objectVariable     initialization(object)
       // Shape circleShape = new Circle();
        Shape rectangleShape = new Rectangle();
        circleShape.area();
        circleShape.draw();
        rectangleShape.draw();


    }
}
