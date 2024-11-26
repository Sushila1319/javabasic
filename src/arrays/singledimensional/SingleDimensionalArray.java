package array.singledimensional;

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

    public void findMaxMinValue() {
        int[] numbers = {10, 1, 40, 20, 50, 80, 45, -1, -5, -9};
        int min = numbers[5];
        int max = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("Minimum Number is " + min);
        System.out.println("Maximum Number is " + max);
    }

    public void findSumInAverage() {
        int[] numbers = {10, 1, 40, 20, 50, 80, 45, -1, -5, -9};
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
            // sum += numbers[i];
        }
        //System.out.println(325/12f);
        System.out.println("The sum is " + sum);
        System.out.println("The average is " + (sum / numbers.length));
    }
}

