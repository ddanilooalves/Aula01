import java.util.Scanner;
public class E4 {

	public static void main(String[] args) {

        try (Scanner entrada = new Scanner(System.in)) {
            System.out.print("\nInforme um valor para temperatura em Celsius: ");
            double C = entrada.nextDouble();

            double F = C * (9 / 5) + 32;
            
            System.out.println("Resposta: \n" + "Fahrenheit = " + F);
        }
    }    
}