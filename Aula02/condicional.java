package Aula02;
import java.util.Scanner;

public class condicional {
    
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            double n1, n2, media;
            String name;

            System.out.print("Informe o nome do aluno: ");
            name = entrada.nextLine();

            System.out.print(name + ", informe a N1: ");
            n1 = entrada.nextDouble();

            System.out.print(name + ", informe a N2: ");
            n2 = entrada.nextDouble();

            media = (n1 + n2) / 2;

            System.out.println("Ficha do Aluno");
            System.out.println("Nome: " + name);
            System.out.println("N1: " + n1);
        
            System.out.println("N2: " + n2);
            System.out.println("Média: " + media);

            if (media >= 6.0) {
            System.out.print("Aluno(a) APROVADO(A)!");
            } else {
            System.out.print("Aluno(a) REPROVADO(A)!");
            }
        }
    }
}
