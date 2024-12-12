package p2.exemplos;
import java.util.Scanner;
public class Questao1151 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int primeiroNum = 0;
        int segundoNum = 1;
        int proximoNum;

        System.out.print(primeiroNum + " " + segundoNum);

        for (int i = 2; i < N; i++) {
            proximoNum = primeiroNum + segundoNum;
            System.out.print(" " + proximoNum);
            primeiroNum = segundoNum;
            segundoNum = proximoNum;
        }
    }
}


