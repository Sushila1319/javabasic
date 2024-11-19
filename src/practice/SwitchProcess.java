package practice;

public class SwitchProcess {
    public void switchProcess(){
        String flower = "lily";
            switch (flower) {
            case "rose" -> System.out.println("Flower is red");

            case "sunFlower" -> System.out.println("Flower is yellow");

            default -> System.out.println("Neither red nor yellow");
        }
    }
            public void withIfElse() {

                String flower = "rose";

                if (flower == "rose") {
                    System.out.println("Flower is red");
                } else if (flower == "sunFlower") {
                    System.out.println("Flower is yellow");
                } else {
                    System.out.println("Neither red nor yellow");
                }

            }


}
