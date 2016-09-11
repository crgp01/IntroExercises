/**
 * Created by crivera on 11/9/16.
 */
import java.util.*;
public class PrimeFactors {
    public static void main(String[] args) {

        PrimeFactors pf = new PrimeFactors();
        pf.primeFactorsList(10);

    }



    public ArrayList<Integer> primeFactorsList(int number) {
        ArrayList<Integer> values = new ArrayList<Integer>();


        for (int i = 2; i < number; i++) {

            if ((primeFactorsEvaluation(number, i)==0) && isPrime(i)) {
                values.add(i);

            }

        }

        printArrayValues(values);
       return values;

    }

    public int primeFactorsEvaluation(int firstNumber, int secondNumber) {

        return firstNumber % secondNumber;

    }

    public boolean isPrime(int number) {
        for(int i=2;i<number;i++) {
            if(number%i==0)
                return false;
        }
        return true;
    }


    public  ArrayList<Integer> printArrayValues(ArrayList<Integer> list) {
        for (int i=0; i < list.size(); i++)

        {
            System.out.println(list.get(i));

        }
        return list;
    }


}


