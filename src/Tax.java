public class Tax {
    double grossIncome;
    String state;
    int dependents;
    Tax (double gi, String st, int dp) {

        grossIncome = gi;
        state = st;
        dependents = dp;
    }



    public double calcTax (){
        if (grossIncome > 50000)
        return grossIncome * 0.08;
        else
            return grossIncome * 0.06;
   }
}

