/*06 - Escreva um algoritmo que leia o código de um determinado produto e mostre a sua
classificação de acordo com a tabela apresentada a seguir: */

package Exercicio02;

import java.util.Scanner;

public class Ex06 {

    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            int cod;

            System.out.println("Informe o código do produto: ");
            cod = entrada.nextInt();

            if (cod == 1) {
                System.out.println("ALIMENTO NÃO-PERECÍVEL!");
            }
            if (cod == 2 || cod == 3 || cod == 4) {
                System.out.println("ALIMENTO PERECÍVEL!");
            }
            if (cod == 5 || cod == 6) {
                System.out.println("VESTUÁRIO!");
            }
            if (cod == 7) {
                System.out.println("HIGIENE PESSOAL!");
            }
            if (cod >= 8 && cod <= 15) {
                System.out.println("LIMPEZA E UTENSÍLIOS DOMÉSTICOS!");
            }
            if (cod == 0 || cod > 16) {
                System.out.println("INVÁLIDO!");
            }
        }
    }
}
