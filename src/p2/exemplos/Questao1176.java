package p2.exemplos;

import java.util.Scanner;

public class Questao1176 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int N = sc.nextInt();
            long fib = calcularFibonacci(N);
            System.out.println("Fib(" + N + ") = " + fib);
        }

    }

    public static long calcularFibonacci(int N) {
        if (N <= 1) {
            return N;
        } else {
            return calcularFibonacci(N - 1) + calcularFibonacci(N - 2);
        }
    }
}