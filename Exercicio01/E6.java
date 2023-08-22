import java.util.Scanner;
public class E6 {

	public static void main(String[] args) {

        try (Scanner entrada = new Scanner(System.in)) {
            
            System.out.print("\nInforme o tempo gasto de viagem: ");
            double tempo = entrada.nextDouble();
            System.out.print("\nInforme a velocidade média durante a viagem: ");
            double velocidade = entrada.nextDouble();

            double distancia = tempo * velocidade;
            double lt_usados = distancia / 12;
            
            System.out.println("Velocidade Média: " + velocidade);
            System.out.println("Tempo de Viagem: " + tempo);
            System.out.println("Litros Utilizados: " + lt_usados);
            System.out.println("");
        }
    }    
}