/*Faça um programa que Leia o Nome e duas notas de uma pessoa e ao final, o programa
deve calcular a média aritmética entre as duas notas. O programa deve ser capaz de validar
se a nota informada é válida (0.0 ≤ nota ≤ 10), caso contrário o sistema deve informar ao
usuário o erro e pedir para ler novamente. Usar um laço Faça-Enquanto na leitura das
notas, e gerar uma saída conforme o exemplo de tela de saída abaixo: */

package Exercicio02;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String name;
            char resp;
            double n1, n2, media;
            do {
            System.out.println("Informe seu nome: ");
            name = sc.next();
            System.out.println("Informe sua N1: ");
            n1 = sc.nextDouble();
            System.out.println("Informe sua N2: ");
            n2 = sc.nextDouble();
            while (n1 < 0 || n1 > 10) {
                System.out.println("Nota inválida!");
                System.out.println("Informe novamente sua N1: ");
                n1 = sc.nextDouble();
            }
            while (n2 < 0 || n2 > 10) {
                System.out.println("Nota inválida!");
                System.out.println("Informe novamente sua N2: ");
                n2 = sc.nextDouble();
            }
            media = (n1 + n2) / 2;
            System.out.println("O aluno " + name + " tem uma média: " + media);
            System.out.print("Continuar (s/n): ");
            resp = sc.next().charAt(0);
            } while (resp == 's');
        }
    }
}
