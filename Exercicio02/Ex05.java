/*05 - Escrever um programa que leia o número de identificação, as 3 notas obtidas por um
aluno nas 3 verificações e a média dos exercícios que fazem parte da avaliação. Valide
para que todas as entradas sejam 0 ≤ nota ≤ 10. Calcule a média de aproveitamento do
aluno, usando a fórmula: */

package Exercicio02;

import java.util.Scanner;

public class Ex05 {
    
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            String name;
            double n1, n2, n3, exe1, exe2, mediaex, mediafinal;
            int numaluno;
            
            System.out.println("Informe o seu nome: ");
            name = entrada.nextLine();
            System.out.println("Insira seu número de aluno: ");
            numaluno = entrada.nextInt();
            System.out.println("Informe sua nota 1: ");
            n1 = entrada.nextDouble();
            System.out.println("Informe sua nota 2: ");
            n2 = entrada.nextDouble();
            System.out.println("Informe sua nota 3: ");
            n3 = entrada.nextDouble();
            System.out.println("Informe a nota da atividade 01: ");
            exe1 = entrada.nextDouble();
            System.out.println("Informe a nota da atividade 02: ");
            exe2 = entrada.nextDouble();

            mediaex = (exe1 + exe2) / 2;
            mediafinal = ((n1 + n2) * 2 + (n3 * 3) + mediaex) / 7;

            if (mediafinal >= 9.0 && mediafinal <= 10) {
                System.out.println("\n\n");
                System.out.println("Conceito A");
                System.out.println("APROVADO!");
            }
            if (mediafinal >= 7.5 && mediafinal < 9.0) {
                System.out.println("Conceito B");
                System.out.println("APROVADO!");
            }
            if (mediafinal >= 6.0 && mediafinal < 7.5) {
                System.out.println("Conceito C");
                System.out.println("APROVADO!");
            }
            if (mediafinal >= 4.0 && mediafinal < 6.0) {
                System.out.println("Conceito D");
                System.out.println("REPROVADO!");
            }
            if (mediafinal < 4.0) {
                System.out.println("Conceito E");
                System.out.println("REPROVADO!");
            }

            System.out.println("O aluno(a) com número " + numaluno + " e nome " + name + " teve as seguintes notas: ");
            System.out.println("N1: " + n1);
            System.out.println("N2: " + n2);
            System.out.println("N3: " + n3);
            System.out.println("Média dos Exercícios: " + mediaex);
            System.out.println("Média de Aproveitamento: " + mediafinal);
        }
    }
}
