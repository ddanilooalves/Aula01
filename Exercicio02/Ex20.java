/*20 - Faça um programa que leia um vetor de inteiros, de 10 posições. A seguir, encontre o 
menor elemento (X) e o maior elemento (Y) do vetor. Imprima uma mensagem 
mostrando: “O menor elemento do vetor é”, X, “e sua posição dentro do vetor é: V[x]. Já 
o maior elemento é “, Y,” e está na posição V[y]”. Assuma que os elementos informados 
no vetor são todos diferentes entre si.  */

package Exercicio02;

import java.util.Scanner;

public class Ex20 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int TAM = 10;
            int num[] = new int[TAM];
            int numMaior = 0, numMenor = 0;

            for (int i = 0; i < 10; i++) {
                System.out.println("Informe 10 números inteiros: ");
                num[i] = sc.nextInt();

                for (int j = 0; j < num.length; j++) {
                    if (num[i] > num[numMaior]) {
                        numMaior = i;
                    }
                    if (num[i] < num[numMenor]) {
                        numMenor = i;
                    }
                }
            }
            System.out.println("O maior elemento do vetor é: " + num[numMaior] + " e sua posição é: " + numMaior);
            System.out.print("O menor elemento do vetor é: " + num[numMenor] + " e sua posição é: " + numMenor);
        }
    }
}
