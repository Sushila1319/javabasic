package practice;

public class NutritionCalculation {
    public static void main(String[] args) {
        FoodNutrition calculation = new FoodNutrition();
        calculation.name = "Broccoli";
        calculation.energy = 24.3;
        calculation.carbohydrate = 4.7f;
        calculation.calcium = 35;
        calculation.fiber = 1.82f;
        calculation.vitaminC = 40.5;
        calculation.vitaminE = 0.11;
        calculation.vitaminK = 77.5;

        calculation.nutrient();



    }
}
