package starpattern;

public class MainStar {
    public static void main(String[] args) {
        StarPattern starPattern = new StarPattern();
        System.out.println("----Rt angled triangle");
        starPattern.printRightAnglePatten();
        System.out.println("Inverted rt angled triangle");
        starPattern.printInvertedRightAngledTriangle();
    }

}
