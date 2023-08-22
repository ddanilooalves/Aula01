import java.util.Scanner;
public class E11 {

    public static void main(String args[]) {

        try (Scanner entrada = new Scanner(System.in)) {
            double x1, y1, x2, y2, de;

            System.out.print("\nInforme o valor de X1: ");
            x1 = entrada.nextDouble();
            System.out.print("\nInforme o valor de Y1: ");
            y1 = entrada.nextDouble();
            System.out.print("\nInforme o valor de X2: ");
            x2 = entrada.nextDouble();
            System.out.print("\nInforme o valor de Y2: ");
            y2 = entrada.nextDouble();

            de = Math.sqrt(Math.pow(y2 - y1, 2.0) + Math.pow(x2 - x1, 2.0));

            System.out.println("\nX1: " + x1);
            System.out.println("\nY1: " + y1);
            System.out.println("\nX2: " + x2);
            System.out.println("\nY2: " + y2);
            System.out.println("\nO valor da DistanciaEuclidiana é: \n" + de);
        }
    }
}