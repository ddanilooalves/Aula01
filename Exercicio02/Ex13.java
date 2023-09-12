/*Faça um programa que leia uma senha (número inteiro). Em seguida, pergunte ao usuário
a senha informada, caso a senha esteja errada imprima “Senha incorreta, tente
novamente” e leia novamente a senha. Caso o usuário digite a senha correta, imprima
“Senha correta! Bem-vindo ao sistema”.*/

package Exercicio02;

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int senha, versenha;

            System.out.println("Informe sua senha (apenas números): ");
            senha = sc.nextInt();
            System.out.println("Digite a senha novamente: ");
            versenha = sc.nextInt();

            while (senha != versenha) {
                System.out.println("Senha incorreta, tente novamente...");
                System.out.println("Digite a senha novamente: ");
                versenha = sc.nextInt();
            }

            if (senha == versenha) {
                System.out.println("Senha correta!");
                System.out.println("Bem-vindo(a) ao sistema...");
            }
        }
    }
    
}
