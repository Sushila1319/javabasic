package loops.doWhile;

public class DoWhile {

    public void performDoWhile() {
        int i=1;
        do{
            i++;
            System.out.println("Number " +i);
        } while (i<=5);

    }

    public void performForOperation(){
        for(int i=2; i <= 6; i++){
            System.out.println("Number " +i);
        }
    }
}
