package p2.exemplos;

import java.util.Scanner;

public class Questao1008 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numeroFun = sc.nextInt();
        int numeroHoras = sc.nextInt();
        double valorHora = sc.nextDouble();

        double salario = numeroHoras * valorHora;

        System.out.println("NUMBER = "+numeroFun);
        System.out.printf("SALARY = U$ %.2f%n", salario);

    }
}
