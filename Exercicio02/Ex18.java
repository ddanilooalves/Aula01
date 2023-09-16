/*Desenhe a seguinte pirâmide de asteriscos. O usuário deve determinar a quantidade de
linhas. */

package Exercicio02;

import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int linha = 1, qntLinhas, i;

            System.out.println("Informe a quantidade de linhas desejadas para construção da pirâmide de asteriscos: ");
            qntLinhas = sc.nextInt();

            while (linha <= qntLinhas) {
                i = 1;
                while (i <= linha) {
                    System.out.print("*");
                    i = i + 1;
                }
                System.out.print("\n");
                linha = linha + 1;
            }
        }
    }
}
