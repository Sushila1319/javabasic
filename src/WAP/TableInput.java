package WAP;

import java.util.Scanner;

public class TableInput {
    public static void main(String[] args) {
        Table multi = new Table();

        Scanner multiply = new Scanner(System.in);
        System.out.println("Table of: ");
        multi.number = multiply.nextInt();
        multi.multiplication();
    }
}
