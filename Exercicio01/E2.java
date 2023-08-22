
import java.util.Scanner;
public class E2 {

	public static void main(String[] args) {

        try (Scanner entrada = new Scanner(System.in)) {
            System.out.print("\nInforme um número inteiro para ser o dividendo: ");
            int dividendo = entrada.nextInt();

            System.out.print("\nInforme um número inteiro para ser o divisor: ");
            int divisor = entrada.nextInt();

            int quociente = (dividendo / divisor);
            int resto = (dividendo % divisor);
            
            System.out.println("Dividendo: " + dividendo);
            System.out.println("Divisor: " + divisor);
            System.out.println("Quociente: " + quociente);
            System.out.println("Resto: " + resto);
        }
    }    
}
