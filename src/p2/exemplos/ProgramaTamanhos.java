package p2.exemplos;

import java.util.Arrays;
import java.util.Scanner;

public class ProgramaTamanhos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tamanhoN;
        int tamanhoM;

        // Tamanho N
        System.out.println("Digite o primeiro tamanho: ");
        tamanhoN = sc.nextInt();
        while(tamanhoN < 1 || tamanhoN > 10){
            System.out.println("Digite um número entre 1 e 10: ");
            tamanhoN = sc.nextInt();
        }

        // Tamanho M
        System.out.println("Digite o segundo tamanho: ");
        tamanhoM = sc.nextInt();
        while(tamanhoM < 1 || tamanhoM > 10 ){
            System.out.println("Digite um número entre 1 e 10");
            tamanhoM = sc.nextInt();
        }
        // Vetor N - Multiplos de 2 sem o 0
        int[] vetorN = new int[tamanhoN];
        for(int i = 0 ; i < tamanhoN ; i++ ){
            vetorN[i] =((i+1) * 2);
        }
        // Vetor M - Multiplos de 10 sem o 0
        int[] vetorM = new int[tamanhoM];
        for(int i = 0; i < tamanhoM ; i++){
            vetorM[i] = ((i+1) * 10);
        }
        // Vetor Intercalacao
        int tamanhoTotal = tamanhoM + tamanhoN;
        int[] vetorIntercalacao = new int[tamanhoTotal];
        int menorTamanho = 0;

        if(tamanhoM < tamanhoN){
            menorTamanho = tamanhoM;
        }
        else{
            menorTamanho = tamanhoN;
        }

        // Intercalar vetor M e vetor N
        int indice = 0;
        for(int i = 0; i < menorTamanho ; i++){
            vetorIntercalacao[indice] = vetorN[i];
            indice = indice + 1;
            vetorIntercalacao[indice] = vetorM[i];
            indice = indice + 1;
        }
        if(tamanhoM > tamanhoN){
            for(int i = menorTamanho; i < tamanhoM ; i++){
                vetorIntercalacao[indice] = vetorM[i];
                indice = indice + 1;
            }
        }
        else{
            for(int i = menorTamanho; i < tamanhoN ; i++){
                vetorIntercalacao[indice] = vetorN[i];
                indice = indice + 1;
            }
        }
        // Exibir o resultado
        System.out.println("Primeiro: " + Arrays.toString(vetorN));
        System.out.println("Segundo: " + Arrays.toString(vetorM));
        System.out.println(Arrays.toString(vetorIntercalacao));

        }
    }
