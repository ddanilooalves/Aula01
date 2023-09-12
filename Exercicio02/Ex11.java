/*11 - Escrever um programa que calcule todos os números inteiros divisíveis por um certo valor
indicado pelo usuário, e compreendidos em um intervalo também especificado pelo
usuário. O usuário deve entrar com um primeiro valor correspondente ao divisor e após
ele vai fornecer o valor inicial do intervalo, seguido do valor final deste intervalo.
Exemplo: Valor do divisor: 3;
Inicio do Intervalo: 17;
Fim do Intervalo: 29;
Saída-> Números divisíveis por 3 no intervalo de 17 a 29: 18, 21, 24, 27.*/

package Exercicio02;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int divisor, inicio, fim, intervalo, calculo;

            calculo = 0;

            System.out.println("Informe o valor do divisor: ");
            divisor = sc.nextInt();
            System.out.println("Informe o início do intervalor: ");
            inicio = sc.nextInt();
            System.out.println("Informe o fim do intervalor: ");
            fim = sc.nextInt();
            System.out.println("Números divisíveis por " + divisor + " no intervalo de " + inicio + " e " + fim + ": ");
            intervalo = inicio;

            for (intervalo = inicio; intervalo < fim; intervalo++) {
                if (intervalo % divisor == 0) {
                    calculo = intervalo;
                    System.out.println(calculo);
                }
            }
            
        }
    }
}
