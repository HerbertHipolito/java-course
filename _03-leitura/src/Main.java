import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner Leitura = new Scanner(System.in);

        int QuantidadeNotas = 0;
        float mediaNotas = 0;
        float usuarioInput = 0;

        while(true){
            System.out.println("Digite uma nota ou digite -1 para sair do sistema");
            usuarioInput = Leitura.nextFloat();
            if (usuarioInput == -1) break;
            mediaNotas += usuarioInput;
            QuantidadeNotas += 1;
        }

        System.out.println("A média das notas é "+(mediaNotas/QuantidadeNotas));

    }
}