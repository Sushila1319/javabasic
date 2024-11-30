package WAP.practice;

public class LoanEligibility {
    int age;
    long yearlyIncome;
    int creditScore;

        public void loanEligibility (){
            System.out.println("Criteria for loan eligibility :");
            System.out.println();
            System.out.println("Eligible age : " + age);
            System.out.println();
            System.out.println("Yearly income for eligibility: " + yearlyIncome +"$");
            System.out.println();
            System.out.println("Credit score for eligibility: " + creditScore);
            System.out.println();
            if (age < 18 || yearlyIncome < 35000 || creditScore < 600){
                System.out.println("Sorry you are not eligible this time, try again later.");
                            }
            else {
                System.out.println("Congratulation!! You are eligible.");
            }


        }

}
