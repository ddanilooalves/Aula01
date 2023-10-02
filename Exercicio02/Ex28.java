/*28 - Faça um programa que calcule o Arranjo e Combinação de N tomados de P a P, An
p
e
Cn
p
. Para tal, crie um método que calcule o fatorial de um número. Crie também outros
dois métodos, uma para calcular An
p
e outra para calcular Cn
p
conforme as equações
abaixo, e ao final mostre os resultados. */

package Exercicio02;

import java.util.Scanner;

public class Ex28 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Informe o valor de N: ");
            int N = sc.nextInt();

            System.out.println("Informe o valor de P: ");
            int P = sc.nextInt();

            int anp = fatorial(N) / fatorial(N-P);
            int cnp = fatorial(N) / (fatorial(P) * fatorial(N-P));

            System.out.println("### RESULTADO ###");
            System.out.println("N = " + N);
            System.out.println("P = " + P);
            System.out.println("Anp = " + anp);
            System.out.println("Cnp = " + cnp);
        }
    }

    public static int fatorial(int N) {
		int fat = 1;
		
		for(int i = 1; i <= N; i++) {
			fat *= i;
		}
		return fat;
	}
}
