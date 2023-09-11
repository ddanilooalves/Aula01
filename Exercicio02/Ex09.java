/*09 - Escreva um programa que receba dois números x e y e calcule x^y. Sem utilizar a biblioteca Math. */

package Exercicio02;

import java.util.Scanner;

public class Ex09 {
    private static int x, y;
    
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            System.out.println("Informe um valor X: ");
            x = entrada.nextInt();
            System.out.println("Informe um valor Y: ");
            y = entrada.nextInt();

            System.out.println(expo(x, y));
        }
    }
    public static int expo(int x1, int y2) {

        if (y2 == 0 || y2 == 1) {
            return x1;
        }
        int total = x1;
        for (int i = 1; i < y2; i++) {
            total *= x1;
        }
        return total;
    }
}
