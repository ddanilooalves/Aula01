/*27 - Crie 2 vetores de inteiros A e B de tamanho 10 preenchidos aleatoriamente. Para tal,
utilize método: int sorteia (int limitInf, int limitSup) descrito abaixo que recebe por
parâmetro os limites inferior e superior dos valores gerados, tais limites deverão ser
informados pelo usuário (valide para que o limitInf seja menor que o limitSup), e retorne
um número neste intervalo. Em seguida crie vetores auxiliares que sejam preenchidos
pelos: */

package Exercicio02;

import java.util.Random;
import java.util.Scanner;

public class Ex27 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            int vetorA[] = new int[10];
            int vetorB[] = new int[10];
            int soma[] = new int[10];
            int intersecao[] = new int[10];
            int diferenca[] = new int[10];
            int intercalacao[] = new int[20];

            System.out.print("Informe o limite inferior: ");
            int limitInferior = sc.nextInt();
            System.out.print("Informe o limite superior: ");
            int limitSuperior = sc.nextInt();

            if (limitInferior >= limitSuperior) {
                System.out.println("O limite inferior deve ser menor que o limite superior!");
                return;
            }

            for (int i = 0; i < 10; i++) {
                vetorA[i] = sorteia(limitInferior, limitSuperior);
                vetorB[i] = sorteia(limitInferior, limitSuperior);
                soma[i] = vetorA[i] + vetorB[i];
            }

            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    if (vetorA[i] == vetorB[j]) {
                        intersecao[i] = vetorA[i];
                        break;
                    }
                }
            }

            for (int i = 0; i < 10; i++) {
                boolean estaNaIntersecao = false;
                for (int j = 0; j < 10; j++) {
                    if (vetorA[i] == intersecao[j]) {
                        estaNaIntersecao = true;
                        break;
                    }
                }
                if (!estaNaIntersecao) {
                    diferenca[i] = vetorA[i];
                }
            }

            int indexIntercalacao = 0;
            for (int i = 0; i < 10; i++) {
                intercalacao[indexIntercalacao++] = vetorA[i];
                intercalacao[indexIntercalacao++] = vetorB[i];
            }

            System.out.println("Vetor A: ");
            exibirVetor(vetorA);

            System.out.println("Vetor B: ");
            exibirVetor(vetorB);

            System.out.println("Vetor Soma: ");
            exibirVetor(soma);

            System.out.println("Vetor Intersecção: ");
            exibirVetor(intersecao);

            System.out.println("Vetor Diferença: ");
            exibirVetor(diferenca);

            System.out.println("Vetor Intercalação: ");
            exibirVetor(intercalacao);
        }
    }

    public static int sorteia(int limitInferior, int limitSuperior) {
        Random r = new Random();
        return r.nextInt(limitSuperior - limitInferior + 1) + limitInferior;
    }

    public static void exibirVetor(int[] vetor) {
        System.out.print("[ ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println(" ]");
    }
}
