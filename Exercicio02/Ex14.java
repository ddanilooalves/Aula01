/*Faça um programa que receba 2 notas (valide as notas, onde 0.0 ≤ nota ≤ 10) de um
número indeterminado de alunos. Calcule e mostre: */

package Exercicio02;

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String name, namemaior = "", namemenor = "";
            double n1, n2, media, mediaclasse, somaMedia, mediamaior, mediamenor;
            char resp;
            int qntaluno, qntalA, qntalR, qntalE;
            qntaluno = 0;
            qntalA = 0;
            qntalR = 0;
            qntalE = 0;
            mediamaior = 0;
            mediamenor = 20;
            somaMedia = 0;

            do {
                System.out.println("Informe seu nome: ");
                name = sc.next();
                System.out.println(name + " informe sua N1: ");
                n1 = sc.nextDouble();
                System.out.println(name + " informe sua N2: ");
                n2 = sc.nextDouble();
                media = (n1 + n2) / 2;
                System.out.println("A média do aluno " + name + " é: " + media);

                if (media >= 7) {
                    System.out.println("APROVADO!");
                    qntalA++;
                }
                if (media <= 3) {
                    System.out.println("REPROVADO!");
                    qntalR++;
                }
                if (media > 3 && media < 7) {
                    System.out.println("EXAME!");
                    qntalE++;
                }
                if (mediamaior < media) {
                    mediamaior = media;
                    namemaior = name;
                }
                if (mediamenor > media) {
                    mediamenor = media;
                    namemenor = name;
                }
                somaMedia = media + somaMedia;
                qntaluno++;
                System.out.println("Coletar dados de outro aluno: ");
                resp = sc.next().charAt(0);
            } while (resp == 's');
            mediaclasse = somaMedia / qntaluno;
            System.out.println("O total de alunos da sala é de: " + qntaluno);
            System.out.println("Quantidade de alunos APROVADOS: " + qntalA);
            System.out.println("Quantidade de alunos REPROVADOS: " + qntalR);
            System.out.println("Quantidade de alunos de EXAME: " + qntalE);
            System.out.println("Média da sala: " + mediaclasse);
            System.out.println(namemaior + " é o aluno com maior média da sala, com: " + mediamaior);
            System.out.println(namemenor + " é o aluno com menor média da sala, com: " + mediamenor);
        }

    }
    
}
