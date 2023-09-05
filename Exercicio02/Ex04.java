/*04 - Desenvolver um programa que calcule o salário bruto e o salário líquido de um funcionário. */

package Exercicio02;

import java.util.Scanner;

public class Ex04 {

     public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            int mat, qnthx;
            double salariom = 788.0, valorhx = 10.0, somahx, somabruto, descInss, descIr, somadesc, sl;

            System.out.println("Informe seu nome, e a quantidade de horas extras trabalhadas.");
            System.out.println("Nome: ");
            String name = entrada.nextLine();
            System.out.println("Matrícula: ");
            mat = entrada.nextInt();
            System.out.println("Horas extras: ");
            qnthx = entrada.nextInt();

            somahx = qnthx * valorhx;
            somabruto = 3 * (salariom + somahx);
            descInss = somabruto*0.12;
            descIr = somabruto*0.2;

            
            if (somabruto >= 1.500) {
                System.out.println("O desconto do INSS é de: " + descInss);
            }
            if (somabruto >= 2.000) {
                System.out.println("O desconto do IR é de: " + descIr);
            }
            
            somadesc = descInss + descIr;
            sl = somabruto - somadesc;
            System.out.println("Salário líquido de " + name + " com matrícula " + mat + " é de: " + sl);
        }
     }
}
