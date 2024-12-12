package p2.exemplos;

import java.util.Scanner;

public class Questao1048 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double reajuste;
        double novoSalario;
        double percentual;
        double salario = sc.nextDouble();

        if(salario <= 400.00){
            percentual = 15;
            reajuste = (percentual/100) * salario;
            novoSalario = reajuste + salario;
        }else if(salario <= 800.00){
            percentual = 12;
            reajuste = (percentual/100) * salario;
            novoSalario = reajuste + salario;
        }else if (salario <= 1200.00){
            percentual = 10;
            reajuste = (percentual/100) * salario;
            novoSalario = reajuste + salario;
        } else if (salario <= 2000.00) {
            percentual = 7;
            reajuste = (percentual/100) * salario;
            novoSalario = reajuste + salario;
        } else {
            percentual = 4;
            reajuste = (percentual/100) * salario;
            novoSalario = reajuste + salario;
        }
        System.out.printf("Novo salario: %.2f%n",novoSalario);
        System.out.printf("Reajuste ganho: %.2f%n",reajuste);
        System.out.printf("Em percentual: %.0f %s", percentual, "%");
    }
}
