/*03 - Escreva um programa que leia o valor da compra e imprima o valor da venda de acordo com a
tabela a seguir. Cuidado com valor inválido de compra: */

package Exercicio02;

import java.util.Scanner;

public class Ex03 {

    public static void main(String[] args) {
        try (Scanner entrada = new Scanner (System.in)) {
            double valorc;

            System.out.println("Informe seu nome e o valor que você pagou no produto!");
            System.out.println("Nome: ");
            String nome = entrada.nextLine();
            System.out.println("Valor: ");
            valorc = entrada.nextDouble();

            System.out.println(nome + " comprou o produto por " + valorc);

            if (valorc < 10) {
                System.out.println("Lucro de 70%: " + valorc*0.7);
            }
            if (valorc >= 10 && valorc < 30) {
                System.out.println("Lucro de 50%: " + valorc*0.5);
            }
            if (valorc >= 30 && valorc < 50) {
                System.out.println("Lucro de 40%: " + valorc*0.4);
            }
            if (valorc >= 50) {
                System.out.println("Lucro de 30%: " + valorc*0.3);
            }
        }
    }
}
