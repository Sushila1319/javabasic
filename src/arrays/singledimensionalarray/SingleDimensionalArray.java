package arrays.singledimensionalarray;

import java.util.Scanner;

public class SingleDimensionalArray {
    public void explainArray(){
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

    public void reverseArray(){
        int[] numbers = {10, 20, 30, 40};
        int[] numbersOddCount = {10,20,30,40,50};

        System.out.println("----Before reverse Order----");
        System.out.println("numbers[0]: " + numbers[0]);
        System.out.println("numbers[1]: " + numbers[1]);
        System.out.println("numbers[2]: " + numbers[2]);
        System.out.println("numbers[3]: " + numbers[3]);

        for (int left = 0, right = numbers.length - 1; left <right && right >2; left++,right--){

            int temp = numbers[left];
            numbers[left] = numbers[right];
            numbers[right] = temp;
        }
        System.out.println("----After reverse Order----");
        System.out.println("numbers[0]: " + numbers[0]);
        System.out.println("numbers[1]: " + numbers[1]);
        System.out.println("numbers[2]: " + numbers[2]);
        System.out.println("numbers[3]: " + numbers[3]);
    }
        public void searchElementInArray(){
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter the size of the array");
            int size = scanner.nextInt();

            int[] numbers = new int[size];
            System.out.println("Enter " + size + " elements");

            for(int i = 0; i <= size; i++){
                numbers[i] = scanner.nextInt();

            }
            System.out.println("Enter the number to search: ");
            int searchElement = scanner.nextInt();
            Integer searchedIndex = null;
            for(int i = 0; i< numbers.length;i++){
                if(numbers[i]==searchElement){
                searchedIndex=i;
                break;
                }
            }
            if (null != searchedIndex){
                System.out.println("The found array is " + searchedIndex);
            }
            else{
                System.out.println("Element is not found at any index");
            }
        }




}

