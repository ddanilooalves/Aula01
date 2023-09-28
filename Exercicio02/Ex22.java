/*22 - Faça um programa que preencha um vetor com 10 números inteiros. Calcule e mostre a 
quantidade de números superiores a 25 e suas respectivas posições. O programa deverá 
mostrar uma mensagem se não existir nenhum número nessa condição. */

package Exercicio02;

import java.util.Scanner;

public class Ex22 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int TAM = 10, indice = 0, cont = 0;
            int vetor[] = new int[TAM];

            for (int i = 0; i < TAM; i++) {
                System.out.println("Informe valores para preencher o vetor de tamanho 10: ");
                vetor[i] = sc.nextInt();
            }
            for (int i = 0; i < TAM; i++) {
                if (vetor[i] > 25) {
                    cont++;
                    indice = i;
                    System.out.println("O valor " + vetor[i] + " é maior que 25 e está no indice " + indice);
                }
            }
        }
    }    
}
