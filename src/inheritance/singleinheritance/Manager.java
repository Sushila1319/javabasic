package inheritance.singleinheritance;

public class Manager extends Employee{
    int teamSize;

    public Manager(String name,  double salary,int teamSize){
        super(name, salary);
        this.teamSize = teamSize;
    }

    @Override
    public void displayDetails(){
       super.displayDetails();
        System.out.println("Team Size: " + teamSize);
    }
}
