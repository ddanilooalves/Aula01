import java.util.Scanner;
public class E7 {

	public static void main(String[] args) {

        try (Scanner entrada = new Scanner(System.in)) {
            
            System.out.print("\nInforme o valor da P.A: ");
            int a1 = entrada.nextInt();
            System.out.print("\nInforme o valor da razão: ");
            int r = entrada.nextInt();
            System.out.print("\nInforme o valor do último termo: ");
            int n = entrada.nextInt();

            int an = a1 + (n-1) * r;
            
            System.out.println("\nO valor da P.A é: " + an);
        }
    }    
}
