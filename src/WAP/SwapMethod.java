package WAP;

public class SwapMethod {
    String firstName;
    String lastName;

    public SwapMethod(){

        String firstName = "sushila";
        String lastName = "lama";
        System.out.println("Before swapping: First Name = " + firstName + " Last Name = " + lastName);

        String temp = firstName;
        firstName = lastName;
        lastName = temp;

        System.out.println("After swapping: First Name = " + firstName + " Last Name = " + lastName);
    }
               public SwapMethod(String firstName, String lastName){

               this.firstName = firstName;
               this.lastName = lastName;

               System.out.println("Before swapping: First Name = " + firstName + " Last Name = " + lastName);

               String temp = firstName;
               firstName = lastName;
               lastName = temp;

               System.out.println("After swapping: First Name = " + firstName + " Last Name = " + lastName);

        }




}



