package WAP.array;

public class FindOddEven {

    public void findOddEven(){

        int[] numbers = {2,5,7,9,10,12,14,15,17,19,20,21,23,25,26,30,40,45,};
        System.out.println("Even numbers are: ");
        int even = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.print(numbers[i] + " ");
            }
        }
        System.out.println();
        System.out.println();
        System.out.println("Odd numbers are: ");
        for (int i = 0; i < numbers.length; i++){
            if(numbers[i] % 2 != 0) {
                System.out.print(numbers[i] + " ");
            }
        }
    }


}
