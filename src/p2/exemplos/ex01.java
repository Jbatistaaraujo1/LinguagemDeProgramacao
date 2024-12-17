package p2.exemplos;

import java.util.Arrays;
import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] lista = new int[5];
        int soma = 0;
        for(int i = 0; i < lista.length; i++){
            int num = sc.nextInt();
            lista[i] = num;
            soma += num;
        }
        int media = soma / lista.length;
        System.out.println(Arrays.toString(lista));
        System.out.println(soma);
        System.out.println(media);

    }

}

// 1.Soma dos elementos de um array
//Crie um programa que:
//Leia 5 números inteiros do teclado e os armazene em um array.
//Calcule a soma de todos os números do array e exiba o resultado.
//Desafio Extra: Calcule também a média dos números.