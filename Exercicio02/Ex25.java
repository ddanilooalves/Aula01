/*25 - Escreva um programa que leia dois vetores – V1 e V2 – cada um com N (N<=10) valores
reais e um terceiro vetor – Op - com N valores do tipo caracter. Seu programa deve gerar
um vetor – Resul como sendo o resultado das operações de V1 com V2, onde o código
da operação está no vetor Op nas respectivas posições.*/

package Exercicio02;

import java.util.Scanner;

public class Ex25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o tamanho dos vetores: ");
        int N = sc.nextInt();

        if (N <= 0 || N > 10) {
            System.out.println("N deve estar entre 1 e 10!");
            return;
        }

        double V1[] = new double[N];
        double V2[] = new double[N];
        char[] Op = new char[N];
        double[] Resul = new double[N];

        System.out.println("Digite os valores do Vetor 1: ");
        for (int i = 0; i < N; i++) {
            V1[i] = sc.nextDouble();
        }

        System.out.println("Digite os valores do Vetor 2: ");
        for (int i = 0; i < N; i++) {
            V2[i] = sc.nextDouble();
        }

        System.out.println("Digite os códigos operacionais: ");
        for (int i = 0; i < N; i++) {
            Op[i] = sc.next().charAt(0);
        }

        for (int i = 0; i < N; i++) {
            switch (Op[i]) {
                case '+':
                    Resul[i] = V1[i] + V2[i];
                    break;
                
                case '-':
                    Resul[i] = V1[i] - V2[i];
                    break;

                case '*':
                    Resul[i] = V1[i] * V2[i];
                    break;

                case '/':
                    if (V2[i] != 0) {
                        Resul[i] = V1[i] / V2[i];
                    } else {
                        System.out.println("Divisão por zero.");
                        return;
                    }
                    break;
                default:
                    System.out.println("Operação inválida: " + Op[i]);
                    return;
            }
        }

        System.out.println("### Resultado das operações ##");
        for (int i = 0; i < N; i++) {
            System.out.println("Resultado [" + i + "] - " + Resul[i]);
        }
    }
    
}
