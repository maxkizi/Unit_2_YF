package training;

public class TestRollers {
    public static void main(String[] args) {
        Rollers f1 = new Rollers();
        f1.color = args[0];
        f1.boot = args[1];
        f1.size = Integer.parseInt(args[2]);
        f1.numberOfWheels = args[3];
        f1.answer = Integer.parseInt(args [4]);

       System.out.println(f1.color);


    }
}
