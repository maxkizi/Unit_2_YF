package training;

public class Rollers {
    String color;
    String boot;
    int size;
    String numberOfWheels;
    int answer;

    public int change_size (int x){
        return size + x;
    }


    public void check(){
        if (answer == 1)
            System.out.println("Skates are ready");
        else System.out.println("Check your skates");
    }

   public void total () {
        System.out.println("Your " + color +  " skates has: ");
        System.out.println("1. " + boot + "boot");
        System.out.println("2. " + numberOfWheels + " wheels" );
        System.out.println("3. " + change_size(-2) + " size");
        System.out.print("and " );
        check();
    }


}
