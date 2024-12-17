package p2.exemplos;

import java.util.Arrays;
import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] lista = new int[10];

        for (int i = 0; i < lista.length; i++) {
            int num = sc.nextInt();
            lista[i] = num;
        }
        int menorNumero = lista[0];
        int maiorNumero = lista[0];
        for(int i = 1; i< lista.length;i++){
            if (lista[i] > maiorNumero){
                maiorNumero = lista[i];
            }
            if (lista[i] < menorNumero){
                menorNumero = lista[i];
            }
        }
        System.out.println("O maior número da lista é:"+ maiorNumero + " e o menor número é: " + menorNumero);
        System.out.println(Arrays.toString(lista));
    }
}



//2 Maior e menor número em um array
//Faça um programa que:
//Leia 10 números inteiros do teclado e os armazene em um array.
//Encontre e exiba o maior e o menor número do array.
//Dica: Use variáveis para armazenar temporariamente o maior e o menor valor enquanto percorre o array.