package p2.exemplos;

import java.util.Scanner;

public class Saudacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual é o seu nome?");
        String nome = sc.nextLine();

        System.out.println("Bem vindo, " + nome + "!");
    }
}
