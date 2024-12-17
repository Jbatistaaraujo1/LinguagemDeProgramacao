package p2.exemplos;

import java.util.Arrays;
import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] lista = new int[20];
        for (int i = 0; i < lista.length; i++) {
            int num = sc.nextInt();
            lista[i] = num;
        }
        int totalPares = 0;
        int totalImpares = 0;

        for (int i = 0; i < lista.length; i++){
            if (lista[i] % 2 == 0) {
                totalPares += 1;
            } else {
                totalImpares += 1;
            }
        }
        int[] pares = new int[totalPares];
        int[] impares = new int[totalImpares];

        for (int i = 0; i <= (totalImpares + totalPares); i++) {
            if (lista[i] % 2 == 0) {
                pares[i] = lista[i];
            }else{
                impares[1] = lista[i];
            }
        }
        System.out.println("Dos numeros na lista,"+ totalPares +"são pares e " + totalImpares + "são impares.");
        System.out.println("São pares: " + Arrays.toString(pares));
        System.out.println("São impares: " + Arrays.toString(impares));
    }
}



//3 Contagem de números pares e ímpares
//Escreva um programa que:
//
//Leia 20 números inteiros e os armazene em um array.
//Conte quantos números são pares e quantos são ímpares no array.
//Exiba os números pares e ímpares separadamente.