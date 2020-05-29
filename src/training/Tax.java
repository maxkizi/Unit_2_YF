package training;

public class  Tax {
    double grossIncome; //общий приход зп
    String state;
    int dependents;
    Tax (double gi, String st, int dt){
        grossIncome = gi;
        state = st;
        dependents = dt;

    }

     double calcTax (double a ){

        if (grossIncome >= a)
            return grossIncome*0.06;
        else
            return grossIncome*0.04;
    }
}
