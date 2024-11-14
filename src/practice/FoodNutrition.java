package practice;

public class FoodNutrition {
    String name;
    double energy;
    float carbohydrate;
    int calcium;
    float fiber;
    double vitaminC;
    double vitaminE;
    double vitaminK;
    boolean isGood = true;

    public void nutrient(){
        System.out.println("Name of vegetable : " + name);
        System.out.println("Energy(calories) contains : " + energy );
        System.out.println("Carbohydrate(g) contains : " + carbohydrate);
        System.out.println("Calcium(mg) contains : " + calcium);
        System.out.println("Fiber(g) contains : " + fiber);
        System.out.println("Vitamin C(mg) : " + vitaminC);
        System.out.println("Vitamin E(mg) : " + vitaminE);
        System.out.println("Vitamin K(mcg) : " + vitaminK);
        System.out.println("Is broccoli good for health? " + isGood);


    }
}
