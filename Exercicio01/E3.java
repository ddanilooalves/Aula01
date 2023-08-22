import java.util.Scanner;
public class E3 {

	public static void main(String[] args) {

        try (Scanner entrada = new Scanner(System.in)) {
            System.out.print("\nInforme seu nome: ");
            String name = entrada.nextLine();

            System.out.print("\nInforme sua idade: ");
            int idade = entrada.nextInt();

            int dias = (idade * 365);
            
            System.out.println(name + " tem " + dias + " dias de vida.");
        }
    }    
}