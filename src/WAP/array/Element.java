package WAP.array;

public class Element {
    public void element() {
        int[] numbers = {1, 2, 3, 4};
        System.out.println("Accessed element: " + numbers[2]);
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("The element " + numbers[2] + " is at index " + i);

        }
    }
}