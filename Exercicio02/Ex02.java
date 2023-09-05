/*02 - Crie um algoritmo que peça a idade do eleitor e o mesmo informe se o eleitor é facultativo
(entre 16 e 17 anos) ou obrigatório (entre 18 a 65) ou dispensado (acima de 65). */

package Exercicio02;

import java.util.Scanner;

public class Ex02 {

    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            int idade;
            String name;

            System.out.println("Caro eleitor, favor informar seu nome e sua idade!");
            System.out.print("Nome: ");
            name = entrada.nextLine();
            System.out.print("Idade: ");
            idade = entrada.nextInt();

            System.out.println(name + " tem " + idade + " anos.");
            
            if (idade == 16 || idade == 17) {
                System.out.println("Eleitor facultativo!");
            }
            if (idade >= 18 && idade <= 65) {
                System.out.println("Eleitor obrigatório!");
            }
            if (idade > 65) {
                System.out.println("Eleitor dispensado!");
            }
        }
    }
}