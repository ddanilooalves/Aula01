/*01 - Faça um programa que leia o nome e sobrenome de duas pessoas (marido e esposa) e um
ano (inteiro). E exiba a seguinte mensagem: “Fulano da Silva é casado com Ciclana de
Souza há XX anos”. Considere o ano atual como 2018. */

import java.util.Scanner;
public class E1 {

	public static void main(String[] args) {

        try (Scanner entrada = new Scanner(System.in)) {
            System.out.print("\nSr. informe seu nome e seu sobrenome: ");
            String nameEsobreM = entrada.nextLine();

            System.out.print("Sra. informe seu nome e seu sobrenome: ");
            String nameEsobreF = entrada.nextLine();

            System.out.print("Informe o ano do casamento de vocês: ");
            int anoCasam = entrada.nextInt();

            int anos = (2023 - anoCasam);
            
            System.out.println(nameEsobreM + " é casado com " + nameEsobreF + " há " + anos + " anos.");
        }
    }
}