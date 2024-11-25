package starpattern;

import java.util.Scanner;

public class Pattern {
    public void printPattern(){
        Scanner scanner = new Scanner(System.in);

        //Input the number of rows
        System.out.println("Enter the number of rows for the pattern: ");

        int rows = scanner.nextInt();

        //Loop to print the patten
        for(int i = 1; i <= rows; i++){

            for(int j = 1; j<=i; j++){
                System.out.print("*");
            //print stars for each column

            }
            System.out.println();
            //Move to the next line after each row

        }

        scanner.close();

    }
}
