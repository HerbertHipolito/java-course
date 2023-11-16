import java.util.Random;
import java.util.Scanner;

public class Main {

    /*
    Agora é com você! Pratique os conceitos que foram ensinados ao longo dessa aula com o seguinte desafio:

    Crie um programa que simula um jogo de adivinhação, que deve gerar um número aleatório entre 0 e 100 e pedir para que o usuário tente adivinhar o número, em até 5 tentativas. A cada tentativa, o programa deve informar se o número digitado pelo usuário é maior ou menor do que o número gerado.

    Dicas:

    Para gerar um número aleatório em Java: new Random().nextInt(100);
    Utilize o Scanner para obter os dados do usuário;
    Utilize uma variável para contar as tentativas;
    Utilize um loop para controlar as tentativas;
    Utilize a instrução break; para interromper o loop.
     */
    public static void main(String[] args) {

        System.out.println("----Jogo da adivinhação!----");
        System.out.println("Um numéro aleatório foi gerado e você deve adivinhá-lo");
        System.out.println("Você terá 5 Tentativas");

        int randomNumber = new Random().nextInt(100);
        Scanner console = new Scanner(System.in);
        int userInput = 0;
        int tries = 1;

        while(true){
            System.out.println(String.format("Tentativa %d",tries));
            System.out.println("Digite um número");
            userInput = console.nextInt();
            if(userInput == randomNumber) {
                System.out.println("Você acertou!!!");
                break;
            }
            if(userInput > randomNumber) System.out.println("O numero digitado é maior que o número gerado");
            if(userInput < randomNumber) System.out.println("O numero digitado é menor que o número gerado");
            if(tries == 5){
                System.out.println("Você fracassou!!");
                break;
            }
            tries += 1;
        }
        System.out.println("---FIM DO JOGO---");
    }
}