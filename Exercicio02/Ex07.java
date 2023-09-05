/*07 - Faça um algoritmo que receba o salário e um código correspondente ao cargo de um
funcionário e imprima seu cargo, o salário, e o valor do aumento segundo o percentual de
aumento ao qual este funcionário tem direito segundo a tabela a seguir e o valor do
aumento baseado no salário. Ao final, mostre o salário com o aumento. */

package Exercicio02;

import java.util.Scanner;

public class Ex07 {
    
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            int cod;
            double salario, perc1, perc2, perc3, perc4;

            System.out.println("Informe o seu código: ");
            cod = entrada.nextInt();
            System.out.println("Informe seu salário: ");
            salario = entrada.nextDouble();

            perc1 = salario*0.5;
            perc2 = salario*0.35;
            perc3 = salario*0.2;
            perc4 = salario*0.1;

            if (cod == 1) {
                System.out.println("CARGO DE ESCRITUÁRIO!");
                System.out.println("Salário: " + salario);
                System.out.println("O aumento em porcentagem é de 50%");
                System.out.println("O aumento no salário será de: " + perc1);
                System.out.println("Valor total com aumento: " + (salario + perc1));
            }
            if (cod == 2) {
                System.out.println("CARGO DE SECRETÁRIO!");
                System.out.println("Salário: " + salario);
                System.out.println("O aumento em porcentagem é de 35%");
                System.out.println("O aumento no salário será de: " + perc2);
                System.out.println("Valor total com aumento: " + (salario + perc2));
            }
            if (cod == 3) {
                System.out.println("CARGO DE CAIXA!");
                System.out.println("Salário: " + salario);
                System.out.println("O aumento em porcentagem é de 20%");
                System.out.println("O aumento no salário será de: " + perc3);
                System.out.println("Valor total com aumento: " + (salario + perc3));
            }
            if (cod == 4) {
                System.out.println("CARGO DE GERENTE!");
                System.out.println("Salário: " + salario);
                System.out.println("O aumento em porcentagem é de 10%");
                System.out.println("O aumento no salário será de: " + perc4);
                System.out.println("Valor total com aumento: " + (salario + perc4));
            }
            if (cod == 5) {
                System.out.println("CARGO DE DIRETOR!");
                System.out.println("Salário: " + salario);
                System.out.println("Sem porcentagem de aumento!");
                System.out.println("Não há aumento de salário!");
            }
        }
    }
}
