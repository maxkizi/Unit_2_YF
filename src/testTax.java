public class testTax {
    public static void main(String [] args){

        Tax t = new Tax(80000, "SH", 2 );
        /*
        t.state = "LA";
        t.dependents = 2;
        t.grossIncome = 60000;
        */

        System.out.println("Налог равен " + t.calcTax());






    }
}
