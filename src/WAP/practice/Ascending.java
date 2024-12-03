package WAP.practice;

public class Ascending {
    public void ascendingOrder(){
        int[] numbers = {98, 54, 62, 55, 36, 99};

        System.out.println("----Before reverse Order----");
        System.out.print(numbers[0] + ",");
        System.out.print(numbers[1] +  ",");
        System.out.print(numbers[2] + ",");
        System.out.print(numbers[3] + ",");
        System.out.print(numbers[4] + ",");
        System.out.println(numbers[5]);

        for (int i = 0; i < numbers.length - 1; i ++) {
            if(numbers[i] > numbers[i+1]){
            int temp =numbers[i];
            numbers[i] = numbers[i+1];
            numbers[i+1] = temp;
         //Reset the index value;
          i = -1;
        }
}
        System.out.println();
        System.out.println("----After reverse Order----");
        System.out.print(numbers[0] + ",");
        System.out.print(numbers[1] +  ",");
        System.out.print(numbers[2] + ",");
        System.out.print(numbers[3] + ",");
        System.out.print(numbers[4] + ",");
        System.out.println(numbers[5]);


    }
}
