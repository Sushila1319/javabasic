package WAP;

public class EvenNumber {
    int firstNumber;
    int secondNumber;

    public void number() {
        System.out.println();

        if (firstNumber % 2 == 0) {
            System.out.println(firstNumber + " is an even number.");
        } else {
            System.out.println(firstNumber + " is not an even number.");
        }

        if (secondNumber % 2 == 0) {
            System.out.println(secondNumber + " is an even number.");
        } else {
            System.out.println(secondNumber + " is not an even number.");
        }
    }
}
