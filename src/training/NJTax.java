package training;

public class NJTax extends Tax {

    NJTax(double gi, String st, int dt) {
        super(gi, st, dt);
    }

    public double adjustForStudents(double tax) {
        if (state == "NJ")
            return tax - 500;

        else return tax;
    }
}
