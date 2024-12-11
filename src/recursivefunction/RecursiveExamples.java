package recursivefunction;
//5! = 5*4*3*2*1
public class RecursiveExamples {

    private Integer userNumber = 5;

    public void printFactorialUsingLoop() {

        int factorial = 1;
        for (int i = 1; i <= userNumber; i++) {
            //factorial*=i;
            factorial = factorial * i;


        }
        System.out.println("The factorial is " + factorial);
    }

    public void printFactorialUsingRecursion() {
        System.out.println("The factorial is " + factorial(userNumber));
    }

    public Integer factorial(Integer n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
        //5 * ...
        //5 * factorial(4)
        //5 * 4 * factorial(3)
        // 5 * 4 * 3 * factorial(2)
        //5 * 4 * 3 * 2 * factorial (1)
        //5*4*3*2*1
    }

    public void sumOfNthNumbers() {
        long sum = 0;
        for (long i = 1; i < userNumber; i++) {
            //sum += i;
            sum = sum + i;
        }
        System.out.println("The sum is" + sum);
    }

    public void sumOfNthNumbersUsingRecursion() {

    }

    public long sum(Long n) {
        if (n == 0) {

            return 0L;
        }
        return n + sum(n-1);

    }
}