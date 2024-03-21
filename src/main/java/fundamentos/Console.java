package fundamentos;

import java.util.Scanner;

public class Console {
    public static void main(String[] args) {
        System.out.println("Bom");
        System.out.println("dia!\n\n");

        System.out.println("Bom");
        System.out.println("dia!");

        System.out.printf("Megasena: %d %d %d %d %d %d %n", 1, 2, 3, 4, 5, 6);
        System.out.printf("Salário: %.1f %n", 1234.5678);

        System.out.printf("Nome: %s%n", "João");
        //Entrada de dados

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite Seu Nome: ");
        String nome = entrada.nextLine();

        System.out.print("Digite Seu sobrenome: ");
        String sobrenome = entrada.nextLine();

        System.out.print("Digite Sua Idade: ");
        int idade = entrada.nextInt();
        //concatenando
        System.out.print("\n\n Nome = " + nome + " " + sobrenome + " tem " + idade + " anos!\n");
        //
        System.out.printf("%s %s tem %d anos.%n", nome, sobrenome, idade);
        //Fechando entrada de dados
        entrada.close();
    }
}
