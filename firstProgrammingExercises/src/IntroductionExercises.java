/**
 * Created by crivera on 9/9/16.
 */
public class IntroductionExercises {




    public static void main (String[] args)
    {

        IntroductionExercises ej1 = new IntroductionExercises();

                ej1.PrintOneAsterisk();
        ej1.Separator();
        ej1.PrintOneAsteriskHorizontalLine(3);
        ej1.Separator();
        ej1.PrintOneAsteriskVerticalLine(3);
        ej1.Separator();
        ej1.RightTriangle(3);
        ej1.Separator();
        ej1.IsocelesTriangle(4);
        ej1.Separator();
        ej1.Diamond(3);
        ej1.Separator();
        ej1.DiamondName(4);
    }

    public void Separator(){

        System.out.println("\n-----------------");
    }

    public void PrintOneAsterisk(){

        System.out.println("*");
    }

    public void PrintOneAsteriskHorizontalLine(int valor) {

        for (int i = 0; i < valor; i++) {
            System.out.print("*");

        }


    }

    public void PrintOneAsteriskVerticalLine(int valor) {

        for (int i = 0; i < valor; i++) {

            System.out.println("*");
        }
    }

    public void RightTriangle(int valor) {

        for (int i = 0; i < valor; i++) {
            for (int j = 0; j <= i; j++)
                System.out.print("*");
            System.out.println();
        }
    }



    public void IsocelesTriangle(int valor) {
        int base = (valor * 2) -1;

        for (int i=0; i<valor; i++){
            int totalAstericos = (2 * i) + 1;
            int espaciosBlanco = (base - totalAstericos)/2;

            for (int j=0; j<espaciosBlanco; j++){
                System.out.print(" ");
            }
            for(int k=0; k<totalAstericos; k++){
                System.out.print("*");
            }

            System.out.println();

        }


    }

    public void Diamond (int valor){

        int base = (valor * 2) -1;

        for (int i=0; i<valor; i++){
            int totalAstericos = (2 * i) + 1;
            int espaciosBlanco = (base - totalAstericos)/2;

            for (int j=0; j<espaciosBlanco; j++){
                System.out.print(" ");
            }
            for(int k=0; k<totalAstericos; k++){
                System.out.print("*");
            }

            System.out.println();

        }

        int lineas = valor-1;

        for (int i=lineas; i>=0; i--){
            int totalAstericos = (2 * i) - 1;
            int espaciosBlanco = (base - totalAstericos)/2;

            for (int j=0; j<espaciosBlanco; j++){
                System.out.print(" ");
            }
            for(int k=0; k<totalAstericos; k++){
                System.out.print("*");
            }

            System.out.println();

        }



    }

    public void DiamondName (int valor){

        int base = (valor * 2) -1;


        for (int i=0; i<valor; i++) {

            if (i == (valor - 1)) {
                System.out.println("Cristina");
                break;
            }


            int totalAstericos = (2 * i) + 1;
            int espaciosBlanco = (base - totalAstericos) / 2;


            for (int j = 0; j < espaciosBlanco; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < totalAstericos; k++) {
                System.out.print("*");
            }

            System.out.println();
        }


        int lineas = valor-1;

        for (int i=lineas; i>=0; i--){
            int totalAstericos = (2 * i) - 1;
            int espaciosBlanco = (base - totalAstericos)/2;

            for (int j=0; j<espaciosBlanco; j++){
                System.out.print(" ");
            }
            for(int k=0; k<totalAstericos; k++){
                System.out.print("*");
            }

            System.out.println();

        }


    }



}





