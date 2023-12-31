/*21 - Escreva um programa que receba quinze números inteiros e armazene em um vetor a raiz 
quadrada de cada número. Caso o valor digitado seja menor do que zero, o número -1 
deve ser atribuído ao elemento do vetor. Após isso, imprima todos os valores 
armazenados.*/

package Exercicio02;

import java.util.Scanner;

public class Ex21 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int TAM = 15;
            int vetor[] = new int[TAM];
            double vetorRaiz[] = new double[TAM];

            for (int i = 0; i < 15; i++) {
                System.out.println("Informe 15 números: ");
                vetor[i] = sc.nextInt();
            }
            for (int j = 0; j < vetor.length; j++) {
                    if (vetor[j] < 0) {
                        vetorRaiz[j] = (-1);
                    } else {
                        double calculo = Math.sqrt(vetor[j]);
                        vetorRaiz[j] = calculo;
                    }
            }
            System.out.println("### Vetor Raiz ###");
            for (int i = 0; i < vetorRaiz.length; i++) {
            System.out.println(vetorRaiz[i]);
            }
        }
    }
    
}
