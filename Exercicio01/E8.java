import java.util.Scanner;
public class E8 {

	public static void main(String[] args) {

        try (Scanner entrada = new Scanner(System.in)) {
            
            System.out.print("\nInforme um valor A: ");
            double A = entrada.nextDouble();
            System.out.print("\nInforme um valor B: ");
            double B = entrada.nextDouble();

            double trocaA = B;
            double trocaB = A;
            
            System.out.println("\nO valor de A é:  " + A);
            System.out.println("Valor de A trocado por B é: " + trocaA);
            System.out.println("\nO valor de B é: " + B);
            System.out.println("Valor de B trocado por A é: " + trocaB);
        }
    }    
}