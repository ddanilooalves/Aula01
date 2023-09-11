/*10 - Escreva um programa que calcule o fatorial de um número inteiro N fornecido pelo
usuário. Cuidado com valores inválidos!*/

package Exercicio02;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Informe um número N: ");
            int n = sc.nextInt();
            int f = n;

            System.out.println("Fatorial de: " + n + "!");

            while (n > 1) {
                f = f * (n - 1);
                n--;
                System.out.println(n + " = " + f);
            }
            System.out.println("O total do fatorial é: " + f);
        }
    }
}
