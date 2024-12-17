package p2.exemplos;

import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] lista = new int[6];
        for(int i = 0;i < lista.length; i++){
            int num = sc.nextInt();
            lista[i] = num;
        }
        for(int i = 5;i >= 0; i--){
            System.out.println(lista[i]);
        }
    }
}



//4.Inverter a ordem de um array
//Implemente um programa que:
//
//Leia 6 números inteiros e os armazene em um array.
//Exiba os números na ordem inversa à qual foram digitados.