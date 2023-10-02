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
        try (Scanner sc = new Scanner(System.in)) {
            int[] vetor = new int[10];

            System.out.println("Informe o limite inferior: ");
            int limitInferior = sc.nextInt();

            System.out.println("Informe o limite superior: ");
            int limitSuperior = sc.nextInt();

            if (limitInferior >= limitSuperior) {   
                System.out.println("O limite inferior deve ser menor que o limite superior!");
                return;
            }

            int numElements = 0;

            Random r = new Random();
            while (numElements < 10) {
                int numAleatorio = sorteia(limitInferior, limitSuperior);
                
                boolean existe = false;
                for (int i = 0; i < numElements; i++) {
                    if (vetor[i] == numAleatorio) {
                        existe = true;
                        break;
                    }
                }
                if (!existe) {
                    vetor[numElements] = numAleatorio;
                    numElements++;
                }
            }
            System.out.println("Vetor preenchido!");
            exibirVetor(vetor);
        }
    }

    public static int sorteia(int limitInferior, int limitSuperior) {
        Random r = new Random();
        return r.nextInt(limitSuperior - limitInferior + 1) + limitInferior;
    }

    public static void exibirVetor(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
    }
}
