import java.util.Scanner;
public class E5 {

	public static void main(String[] args) {

        try (Scanner entrada = new Scanner(System.in)) {
            System.out.print("\nInforme o valor do produto: ");
            double valor = entrada.nextDouble();

            System.out.print("Informe o valor da porcentagem do desconto: ");
            double percent = entrada.nextDouble();
            double contapercent = percent / 100;
            double valordesconto = contapercent * valor;

            double valorsaida = valor - valordesconto;
            
            System.out.println("O valor a ser pago com desconto é de: " + valorsaida);
        }
    }    
}