package WAP.findtheprimeandsum;

public class FindPrime {
  int number;
public void checkPrime(){
    if (number % 2 == 0 && number!=2 ){
        System.out.println("It is not a prime number");
    }
     else if(number % 3 == 0 && number!=3){
        System.out.println("It is not a prime number");
    }
     if (number % 5 == 0 && number!=5){
        System.out.println("It is not a prime number");
    }
     else if(number % 7 == 0 && number!=7){
        System.out.println("It is not a prime number");
    }
      else

    {
        System.out.println("It is a prime number");

    }

    }


}
