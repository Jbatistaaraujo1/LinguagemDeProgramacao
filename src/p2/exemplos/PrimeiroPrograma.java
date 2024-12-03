package p2.exemplos;

public class PrimeiroPrograma {
    public static void main(String[] args) {
        /*
        Recebe 2 idades, depois compara e imprime coisas diferentes dependendo de quem é a maior
         */
        String nome = "Paulo";
        int idadePaulo = 44;
        double pesoPaulo = 86.6;
        float alturaPaulo = 1.8F;

        String outroNome = "Rita";
        int idadeRita = 50;
        double pesoRita = 68.2;
        float alturaRita = 1.7F;

        if(pesoPaulo > pesoRita) {
            System.out.println(nome + " Tem " + (pesoPaulo - pesoRita) + "Kg a mais que" + outroNome);
        } else if(pesoPaulo < pesoRita) {
            System.out.println(outroNome + " Tem " + (pesoRita - pesoPaulo) + "Kg a mais que" + nome);
        } else {
            System.out.println(nome + " e " + outroNome + "Pesam iguais.");
        }
    }
}
