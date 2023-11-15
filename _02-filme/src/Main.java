public class Main {
    public static void main(String[] args) {
        System.out.println("Bem vindo ao Screen Match");
        System.out.println("Filme: Top Gun: Maverick");

        int ano = 2022;

        String sinopse = "Filme de gala dos anos 80";

        System.out.println(sinopse);

        /*
        comentário aqui;
        comparação de strings
         */

        String senha = "12345";
        if (senha.equals("12345")) {
            System.out.println("Acesso autorizado!");
        } else {
            System.out.println("Senha incorreta.");
        }

    }
}