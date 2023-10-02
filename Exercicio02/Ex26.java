/*26 - Faça um programa que leia um vetor de inteiros de 10 posições e garanta que todos os
elementos presentes no vetor sejam todos distintos entre si.*/

package Exercicio02;

import java.util.Scanner;

public class Ex26 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int[] vetor = new int[10];

            System.out.println("Digite 10 números inteiros para compor o vetor:");

            for (int i = 0; i < 10; i++) {
                System.out.print("Digite o valor " + (i + 1) + ": ");
                vetor[i] = sc.nextInt();
            }

            boolean valorDuplo = true;
            for (int i = 0; i < 9; i++) {
                for (int j = i + 1; j < 10; j++) {
                    if (vetor[i] == vetor[j]) {
                        valorDuplo = false;
                        break;
                    }
                }
            }

            if (valorDuplo) {
                System.out.println("Todos os valores do vetor são diferentes.");
            } else {
                System.out.println("Há valores repetidos no vetor.");
            }
        }
    }

}
