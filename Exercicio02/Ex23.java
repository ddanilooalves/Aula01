/*23 - Faça um programa que leia um primeiro vetor com dez números inteiros e um segundo 
vetor com cinco números inteiros. Mostre uma lista dos números do primeiro vetor com 
seus respectivos divisores armazenados no segundo vetor, bem como suas posições.*/

package Exercicio02;

import java.util.Scanner;

public class Ex23 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int TAM = 10, TAM2 = 5;
            int vetor[] = new int[TAM];
            int vetor2[] = new int[TAM2];

            for (int i = 0; i < TAM; i++) {
                System.out.println("Informe os números para compor o 1º vetor");
                vetor[i] = sc.nextInt();
            }
            for (int i = 0; i < TAM2; i++) {
                System.out.println("Informe os números para compor o 2º vetor");
                vetor2[i] = sc.nextInt();
            }
            for (int i = 0; i < vetor.length; i++) {
                for (int j = 0; j < vetor2.length; j++) {
                    if (vetor[i] % vetor2[j] == 0) {
                        System.out.println("Número: " + vetor[i]);
                        System.out.println("Divisivel por " + vetor2[j] + " na posição " + j);
                    }
                }
            }
        }
    }
}
