public class Conta {

    double saldo;
    int agencia;
    int numero;
    String titular;

    boolean deposita(double valor){

        if (!this.checarValorMaiorZero(valor)) return false;
        this.saldo += valor;
        return true;

    }

    boolean sacar(double valor){

        if (!this.checarValorMaiorZero(valor)) return false;

        if((this.saldo-valor) < 0){
            System.out.println("Saldo insuficiente");
            return false;
        }

        this.saldo -= valor;
        return true;
    }

    boolean tranfere(double valor, Conta destino){

        if (!this.checarValorMaiorZero(valor)) return false;

        if(this.saldo < valor ){
            System.out.println("Saldo insuficiente");
            return false;
        }

        this.saldo -= valor;
        destino.saldo += valor;

        return true;

    }

    boolean checarValorMaiorZero(double valor) {

        if(valor < 0){
            System.out.println("Valor inválido");
            return false;
        }
        return true;

    }

}
