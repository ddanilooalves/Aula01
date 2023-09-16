/*Faça um programa que leia um numero inteiro N e mostre todos os números primos entre
1 e N. Número primo é aquele que é divisível apenas por 1 e ele mesmo.
Ex. 17 é um número primo, pois só é divisível por 1 e por ele mesmo. */

package Exercicio02;

import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N, cont = 0;;

        System.out.println("Informe um número N: ");
        N = sc.nextInt();

        System.out.println("Os números primos entre " + 1 + " e " + N + " são: ");

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    cont++;
                }
            }
            if (cont == 2) {
                System.out.println(i);
            }
            cont = 0;
        }
    }
    
}
