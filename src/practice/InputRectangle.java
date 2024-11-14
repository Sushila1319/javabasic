package practice;

import java.util.Scanner;

public class InputRectangle {

    public static void main(String[] args) {

        Rectangle Tv = new Rectangle();

        Scanner Input = new Scanner(System.in);
        System.out.println("Input the length ");
        Tv.length = Input.nextInt();

        System.out.println("Input the breadth ");
       Tv.breadth = Input.nextInt();

        Tv.area();
        Tv.perimeter();
    }
}
