/*01 - Crie um programa para determinar se um número inteiro A é divisível por outro número
B. Os valores devem ser fornecidos pelo usuário. */

package Exercicio02;

import java.util.Scanner;

public class Ex01 {
    
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            int a;
            double b;

            System.out.println("Informe um valor A inteiro para saber se é divisivel pelo número B informa por você também!");
            System.out.print("A: ");
            a = entrada.nextInt();
            System.out.print("B: ");
            b = entrada.nextDouble();

            if (b == 0) {
                System.out.println("Não há divisão por 0!");
            }
            if (a % b == 0) {
                System.out.println(a + " é divisivel por " + b);
            } else {
                System.out.println(a + " não é divisivel por " + b);
            }
        }
    }
}
