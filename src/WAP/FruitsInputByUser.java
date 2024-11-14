package WAP;

import java.util.Scanner;

public class FruitsInputByUser {
    public static void main(String[] args) {

        Fruits market = new Fruits();

        Scanner variety = new Scanner(System.in);
        System.out.println("What is the name of fruit? ");
        market.nameOfFruit = variety.next();

        System.out.println("What is the colour of fruit? ");
        market.color = variety.next();

        System.out.println("What is the shape of fruit? ");
        market.shape = variety.next();

        System.out.println("What is the size of fruit? ");
        market.size = variety.next();

        System.out.println("What is the texture of fruit? ");
        market.texture = variety.next();

        System.out.println("What are the nutrition does it contains? ");
        market.nutrientContent = variety.next();
        market.nutrientContent = market.nutrientContent + variety.nextLine();
        market.details();
    }

}
