package p2.exemplos;

import java.util.Scanner;

public class Questao1173 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vetor = new int[10];
        int V = sc.nextInt();

        vetor[0] = V;

        for (int i = 1; i < vetor.length; i++) {
            vetor[i] = 2 * vetor[i - 1];
        }

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("N[" + i + "] = " + vetor[i]);
        }
    }
}