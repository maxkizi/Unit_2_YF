package training;

public class TestTax {
    public static void main(String[] args) {
      // Tax t = new Tax();
        NJTax NJt = new NJTax(50000, "SJ", 2);

        double yourTax = NJt.calcTax(50000 );
        double studentsTax = NJt.adjustForStudents(yourTax);
        System.out.println("Your tax is " + studentsTax);
    }
}
