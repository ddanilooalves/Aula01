/*08 - Faça um programa que leia um código, x e y e calcule f(x,y) de acordo com as equações
abaixo: */

package Exercicio02;

import java.util.Scanner;

public class Ex08 {

    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            int cod;
            double x, y, calculo1, calculo2, calculo3, calculo4;

            System.out.println("Informe o código da equação à ser calculada: ");
            cod = entrada.nextInt();
            System.out.println("Informe o valor de X: ");
            x = entrada.nextDouble();
            System.out.println("Informe o valor de Y: ");
            y = entrada.nextDouble();

            calculo1 = Math.sqrt(Math.pow(x, 3) + x * ((2 * y) - x)/ Math.pow(y, 2));
            calculo2 = Math.sqrt((Math.pow(x, 3) + Math.pow(y, 3)) + (Math.pow(x, 3) - Math.pow(y, 3))) / x * y;
            calculo3 = (2 * x) + Math.sqrt(x * y);
            calculo4 = Math.sin(x) + Math.cos(y);

            if (cod == 1) {
                System.out.println("F(x,y) = " + calculo1);
            }
            if (cod == 2) {
                System.out.println("F(x,y) = " + calculo2);
            }
            if (cod == 3) {
                System.out.println("F(x,y) = " + calculo3);
            }
            if (cod == 4) {
                System.out.println("F(x,y) = " + calculo4);
            }
        }
    }
}
