import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("***********************");
        System.out.println("Dados iniciais do cliente:");
        System.out.println("Nome: Jacqueline Oliveira");
        System.out.println("Tipo conta: Corrente");
        System.out.println("Saldo inicial: R$ 2500,00");
        System.out.println("***********************");

        Scanner console = new Scanner(System.in);
        int userInput = 0;
        float valueAccount = 2500;
        float valueToReceive = 0;
        float valueToSend = 0;
        boolean while_condition = true;

        while(while_condition){

            System.out.println("Operações");

            System.out.println("1 - Consultar saldos");
            System.out.println("2 - Receber valor");
            System.out.println("3 - Transferir valor");
            System.out.println("4 - Sair");

            System.out.println("Digite a opção desejada:");

            userInput = console.nextInt();

            switch (userInput){
                case 1:
                    System.out.println("O seu saldo é "+valueAccount);
                    break;
                case 2:
                    System.out.println("implementar receber valor");
                    valueToReceive = console.nextFloat();
                    valueAccount += valueToReceive;
                    System.out.println("Valor de "+valueToReceive+" Adicionado na sua conta");
                    break;
                case 3:
                    System.out.println("implementar transferir valor");
                    valueToSend = console.nextFloat();
                    valueAccount -= valueToSend;
                    System.out.println("Valor de "+valueToSend+" removido da sua conta");
                    break;
                case 4:
                    while_condition = false;
                    break;
                default:
                    System.out.println("Opção não disponível - entre com uma nova");
            }
/*
            if (userInput == 1 ) System.out.println("O seu saldo é "+valueAccount);
            else if (userInput == 2) {
                System.out.println("implementar receber valor");
                valueToReceive = console.nextFloat();
                valueAccount += valueToReceive;
                System.out.println("Valor de "+valueToReceive+" Adicionado na sua conta");
            } else if (userInput == 3) {
                System.out.println("implementar transferir valor");
                valueToSend = console.nextFloat();
                valueAccount -= valueToSend;
                System.out.println("Valor de "+valueToSend+" removido da sua conta");
            } else if (userInput == 4) break;
              else System.out.println("Opção não disponível - entre com uma nova");
*/
        }

    }
}