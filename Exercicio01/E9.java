import java.util.Scanner;
public class E9 {

    public static void main(String args[]) {

        try (Scanner entrada = new Scanner(System.in)) {
            double raio, area, perimetro;

            System.out.print("\nInforme o valor do raio: ");
            raio = entrada.nextDouble();
            
            area = Math.PI * Math.pow(raio, 2.0);
            perimetro = 2 * Math.PI * raio;

            System.out.println("\nRaio: " + raio);
            System.out.println("\nÁrea: " + area);
            System.out.println("\nPerimetro: " + perimetro);
        }
    }
}