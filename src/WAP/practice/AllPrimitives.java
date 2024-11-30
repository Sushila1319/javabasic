package WAP.practice;

public class AllPrimitives {

    String name;
    Integer age ;
    float height;
    String address;
    String job;
    long salary;
    long newSalary;
    short increment;


    public void primitive(){

        System.out.println("Name : " + name);
        System.out.println("Age : " + age) ;
        System.out.println("Height : " + height);
        System.out.println("Address : " + address);
        System.out.println("Job : " + job);
        System.out.println("Current Salary : " + salary);
        newSalary= salary+(increment*salary)/100;
        System.out.println("New Salary :" + newSalary);

        if(salary>=newSalary) {
            System.out.println("Is there any increment?  False");
        }
            else{
                System.out.println("Is there any increment? True");
        }









    }


}
