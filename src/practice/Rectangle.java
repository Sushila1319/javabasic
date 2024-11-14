package practice;

public class Rectangle {
    int length;
    int breadth;

    public void area(){
        System.out.println("The area of the rectangle is " + ( length * breadth));
    }
    public void perimeter(){
        System.out.println("The perimeter of the rectangle is " + ( 2 * ( length + breadth)));
    }
}
