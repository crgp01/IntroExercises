/**
 * Created by crivera on 11/9/16.
 */
public class FizzBuzz {


    public void fizzBuzz(){


        for (int i=1; i<=100; i++){

            if ((divisibleByThree(i)==0) && (divisibleByFive(i)==0))
            {
                System.out.println("FizzBuzz");

            }
            else if (divisibleByFive(i)==0){
                System.out.println("Buzz");

            }
            else if (divisibleByThree(i)==0)
            {
                System.out.println("Fizz");
            }
            else {

                System.out.println(i);
            }

        }
    }

    public  int divisibleByThree (int number){

        return number % 3;

    }

    public int divisibleByFive(int number){

        return number % 5;

    }


}
