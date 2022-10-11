package ClaseI_IntroduccionJavaTM;

import java.util.Scanner;

public class Main {
    public static boolean isEven(int n){
        return n%2==0;
    }

    public static boolean isMultiple(int number, int m){
        return number%m==0;
    }

    public static boolean isPrime(int n){
        int counter = 2;
        boolean prime = true;

        while((prime) && (counter!=n)){
            if(n%counter == 0){
                prime = false;
            }
            counter++;
        }
        return prime;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // QUITA LOS COMENTARIOS DE ALGÚN EJERCICIO Y MIRA LA MAGIA!

        // EJERCICOI 1
        /*System.out.print("Ingresa un número: ");
        int n = scan.nextInt();

        int counter = 0;
        int number = 1;
        while(counter<n){
            if(isEven(number)){
                System.out.println(number);
                counter++;
            }
            number++;
        }*/

        // EJERCICIO 2
        /*System.out.println("Ingresar número n: ");
        int n = scan.nextInt();
        System.out.println("Ingresar número m: ");
        int m = scan.nextInt();

        int counter = 0;
        int number = 1;
        while(counter<n){
            if(isMultiple(number,m)){
                System.out.println(number);
                counter++;
            }
            number++;
        }*/

        // EJERCICIO 3
        /*System.out.print("Ingresar número n: ");
        int n = scan.nextInt();

        if(isPrime(n)==true){
            System.out.println(n+" es primo");
        }else {
            System.out.println(n+" no es primo");
        }*/

        // EJERCICIO 4
        /*System.out.print("Ingresar número n: ");
        int n = scan.nextInt();

        int counter = 0;
        int number = 2;
        while(counter<n){
            if(isPrime(number)){
                System.out.println(number);
                counter++;
            }
            number++;
        }*/

        // EJERCICIO 5
        /*System.out.print("Ingresar la cantidad m que se repite el dígito d: ");
        int m = scan.nextInt();
        System.out.print("Ingresar el d dígito: ");
        int d = scan.next().charAt(0);
        System.out.print("Ingresar la cantidad n de números: ");
        int n = scan.nextInt();

        int counter = 0;
        int countNum = 0;
        int number = 0;
        while (countNum < n){
            String numString = String.valueOf(number);
            for (int i = 0; i < numString.length(); i++) {
                if (numString.charAt(i) == d){
                    counter++;
                }
                if (counter >= m) {
                    System.out.print(number+" ");
                    counter = 0;
                    countNum++;
                }
            }
            counter = 0;
            number++;
        }*/
    }
}
