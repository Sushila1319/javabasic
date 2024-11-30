package WAP.practice;

public class FindLargestNumber {
    public static void main(String[] args) {

    int firstNumber = 33;
    int secondNumber = 45;
    int thirdNumber = 76;
    if(firstNumber > secondNumber && firstNumber > thirdNumber ){
        System.out.println("The largest number is : " + firstNumber );
    } else if (secondNumber > firstNumber && secondNumber>thirdNumber) {
        System.out.println("The largest number is : " + secondNumber);
    }
    else{
        System.out.println("The largest number is : " + thirdNumber);
    }
    }
}