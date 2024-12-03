package WAP.practice;

public class MainBank {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.setAccountHolderName("David Joe");
        account.setAccountNumber(00123456l);
        account.setBalance(140000.78d);


        System.out.println("Account holder name:" + account.getAccountHolderName());
        System.out.println("Account number:  " + account.getAccountNumber());
        System.out.println("Total Balance: " + account.getBalance());

    }


}
