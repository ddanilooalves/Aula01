/*24 - Faça um programa que leia um código inteiro e um vetor de 10 posições de números reais. 
Se o código for zero, termine o programa. Se for 1, mostre o vetor na ordem direta. Se for 
2, mostre o vetor na ordem inversa. */

package Exercicio02;

import java.util.Scanner;

public class Ex24 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int cod;
            int TAM = 10;
            double vetor[] = new double[TAM];

            for (int i = 0; i < TAM; i++) {
                System.out.println("Informe os valores para compor o vetor: ");
                vetor[i] = sc.nextDouble();
            }
            
            System.out.println("Agora informe o código entre 0(sair), 1(Vetor), 2(Vetor inverso): ");
            cod = sc.nextInt();

            switch (cod) {
                case 1:
                    System.out.print("[ ");
                    for (int i = 0; i < TAM; i++) {
                    System.out.print(vetor[i] + ", ");
                    }
                    System.out.println("]");
                    break;

                case 2: 
                    System.out.print("[ ");
                    for (int j = TAM - 1; j >= 0; j--) {
                    System.out.print(vetor[j] + ", ");
                    }
                    System.out.println(" ]");
                    break;
                case 0:
                    System.out.println("Programa encerrado!");    
            }
        }
    }
}
