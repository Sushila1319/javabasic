package arrays;

public class SingleDimensionalArray {

    public void explainArray() {
        int[] numbers = {10, 20, 30, 40, 50}; //size:5
        // float[] floatNumbers = {1.2f, 1.6f};
        // long[] longNumbers = {10, 20, 30, 40, 50};
        // String[] elements = {"Apple", "Mango", "Orange"};
        // int number = 10;

        //Iterating through the array using a for loop
        System.out.println("Accessed Element:" + numbers[4]);
        System.out.println("Array size: " + numbers.length);
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Elements at index " + i + ": " + numbers[i]);

        }

    }
}