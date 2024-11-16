package WAP;

public class SwapC {
    public static void main(String[] args) {
        SwapMethod swap = new SwapMethod();


        SwapMethod swapParameterized = new SwapMethod("sushila", "lama");
        System.out.println(swapParameterized.firstName);
        System.out.println(swapParameterized.lastName);
    }
}
