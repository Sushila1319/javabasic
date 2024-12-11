package abstractinterface;

import java.util.Scanner;

abstract class AbstractSorter implements SorterInterface {
    protected int[] numbers;
    protected int size;

    //method overriding
    @Override
    public void askNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many numbers?");
        size = scanner.nextInt();
        numbers = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Enter number" + (i + 1) + " : ");
            numbers[i] = scanner.nextInt();

        }
        System.out.println("The numbers are :" + numbers);
    }

    @Override
    public void printNumbers() {
        //using loop(print )
        System.out.print("The ascending numbers are: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
