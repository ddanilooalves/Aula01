/*Altere o programa anterior para que dessa vez seja desenhado o triângulo abaixo: */

package Exercicio02;

import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int qntLinhas,linha = 0;

            System.out.println("Informe a quantidade de linhas desejadas para construção da pirâmide de asteriscos: ");
            qntLinhas = sc.nextInt();

            double divisor = qntLinhas / 2;

            System.out.println("Quantidade de linhas: " + qntLinhas);

            for(int i = 0; i <= qntLinhas ; i++) {
                String out = "";
                if (i < divisor) {
                    for (int j = 0; j <= linha; j++) {
                    System.out.print("*");
                    }
                    linha++;
                } else {
                    for (int k = 0; k <= linha; k++) {
                        System.out.print("*");
                    }
                    linha--;
                }
                System.out.println(out);
            }
        }
    }
}
