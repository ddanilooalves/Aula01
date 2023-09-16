/*Faça um programa que leia o código dos produtos pedidos e as quantidades desejadas;
calcule e mostre o valor a ser pago por produto (preço * quantidade) e o total do pedido.
Considere que o cliente deve informar quando o pedido deve ser encerrado. */

package Exercicio02;

import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int cod, qnt;
            double calculo = 0, soma = 0, somatotal = 0;

            do {
                System.out.println("Informe o código do produto desejado, caso queira sair é só digitar 0: ");
                cod = sc.nextInt();
                System.out.println("Qual a quantidade?");
                qnt = sc.nextInt();

                while (cod != 0 && cod != 1 && cod != 2 && cod != 3 && cod != 4 && cod != 5) {
                    System.out.println("Código inválido, favor digitar código correto: ");
                    cod = sc.nextInt();
                }

                switch (cod) {
                    case 1:
                        System.out.println("Cachorro quente");
                        calculo = qnt * 1.50;
                        System.out.println("O valor é de: " + calculo);
                        soma = soma + calculo;
                        break;
                        

                    case 2:
                        System.out.println("Hamburguer");
                        calculo = qnt * 2.00;
                        System.out.println("O valor é de: " + calculo);
                        soma = soma + calculo;
                        break;

                    case 3:
                        System.out.println("Cheeseburger");
                        calculo = qnt * 2.50;
                        System.out.println("O valor é de: " + calculo);
                        soma = soma + calculo;
                        break;

                    case 4:
                        System.out.println("Eggcheeseburger");
                        calculo = qnt * 3.00;
                        System.out.println("O valor é de: " + calculo);
                        soma = soma + calculo;
                        break;

                    case 5:
                        System.out.println("Refrigerante");
                        calculo = qnt * 1.50;
                        System.out.println("O valor é de: " + calculo);
                        soma = soma + calculo;
                        break;

                    case 0:
                        System.out.println("Saindo...");
                        break;
                    default:
                        System.out.println("Código inválido!");
                }
                somatotal = soma;
            } while (cod != 0);
            System.out.println("Soma total: " + somatotal);
        } 
    }
    
}
