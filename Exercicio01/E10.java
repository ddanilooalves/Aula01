/*
import java.util.Scanner;
public class E9 {
    
    public static void main(String args[]) {

        try (Scanner entrada = new Scanner(System.in)) {
            double co, ca, hip;

            System.out.print("Informe o Cateto Adjacente: ");
            ca = entrada.nextDouble();
            System.out.print("Informe o Cateto Oposto: ");
            co = entrada.nextDouble();

            hip = Math.sqrt(Math.pow(co, 2.0) + Math.pow(ca, 2.0));

            System.out.println("Cateto Oposto: " + co);
            System.out.println("Cateto Adjacente: " + ca);
            System.out.println("Hipotenusa: " + hip);
        }
    }
}
*/

import java.util.Scanner;
public class E10 {

    public static void main(String args[]) {

        try (Scanner entrada = new Scanner(System.in)) {
            double x, y, eq;

            System.out.print("\nInforme um valor X: ");
            x = entrada.nextDouble();
            System.out.print("\nInforme um valor Y: ");
            y = entrada.nextDouble();

            eq = 2 * (Math.sqrt((3.0*x + 30)) / 3) + Math.pow((y - 32), 4.0);

            System.out.println("\nO valor da equação é: " + eq);
        }
    }
}