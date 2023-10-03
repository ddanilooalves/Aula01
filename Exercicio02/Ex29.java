/*29 - Utilize o método sorteia que retorna um número aleatório de limiteInferior até
limiteSuperior para gerar um número aleatório neste intervalo. O número gerado pelo
sorteia deverá ser colocado em um vetor de 1000 posições. Leia limiteInferior e
limiteSuperior e preencha o vetor de 1000 posições, garantindo que todos os valores
presentes no vetor são distintos entre si.*/

package Exercicio02;

import java.util.Random;
import java.util.Scanner;

public class Ex29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vetor = new int[1000];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = sorteia(0, 1000);
        }

        System.out.println("Vetor: ");
        exibirVetor(vetor);
    }

    public static int sorteia(int limitInferior, int limitSuperior) {
        Random r = new Random();
        return r.nextInt(limitSuperior - limitInferior + 1) + limitInferior;
    }

    public static void exibirVetor(int[] vetor) {
        System.out.println("[ ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i] + " ");
        }
        System.out.println(" ]");
    }
}


