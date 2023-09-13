/*Escreva um programa que apresente quatro opções: (a) consulta saldo, (b) saque e
(c)depósito e (d) sair. O saldo deve iniciar em R$ 0,00. A cada saque ou depósito o valor
do saldo deve ser atualizado.*/

package Exercicio02;

import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            char opc;
            double saldo = 0.0, saque = 0, deposito;

            do {
                System.out.println("### BANCO FASAM ###");
            	System.out.println("a - Consulta Saldo");
            	System.out.println("b - Saque");
            	System.out.println("c - Depósito");
            	System.out.println("d - Sair");
            	
            	System.out.println("Informe a opção desejada: ");
            	opc = sc.next().charAt(0);
            	while(opc != 'a' && opc != 'b' && opc != 'c' && opc != 'd'
            			&& opc != 'A' && opc != 'B' && opc != 'C' && opc != 'D') {
            		System.out.println("Opção inválida, informe uma opção válida: ");
            		opc = sc.nextLine().charAt(0);
                }
                switch (opc) {
            		case 'A':
            		case 'a': 
            			System.out.println("Saldo -> " + saldo);
            			break;
            		case 'b':
            		case 'B': 
            			System.out.println("# SAQUE #");
                        System.out.println("Valor de saque: ");
                        saque = sc.nextDouble();
                        saldo = saldo - saque;
            			break;
            		case 'c':
            		case 'C':
            			System.out.println("# DEPÓSITO #");
                        System.out.println("Valor de deposito: ");
                        deposito = sc.nextDouble();
                        saldo = saldo + deposito;
            			break;
            		case 'd':
            		case 'D':
            			System.out.println("Saindo...");
            			break;
            		default:
            			System.out.println("Menu inválido! Tente novamente!");
            	}

            } while(opc != 'd' && opc != 'D');
        }
    }   
}
