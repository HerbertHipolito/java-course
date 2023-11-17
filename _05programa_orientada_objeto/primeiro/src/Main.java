public class Main {
    public static void main(String[] args) {
        Conta primeiraConta = new Conta();
        System.out.println(primeiraConta.saldo);
        primeiraConta.deposita(-100);
        System.out.println(primeiraConta.saldo);
        primeiraConta.deposita(100);
        System.out.println(primeiraConta.saldo);

        System.out.println("---saque simulação---");
        System.out.println(primeiraConta.saldo);
        primeiraConta.sacar(25);
        System.out.println(primeiraConta.saldo);
        System.out.println(primeiraConta.sacar(-100));
        System.out.println(primeiraConta.sacar(1231231));
        System.out.println(primeiraConta.saldo);

        System.out.println("---tranferencia simulação---");
        Conta segundaConta = new Conta();
        segundaConta.deposita(2000);
        System.out.println("Segunda conta saldo "+segundaConta.saldo);
        System.out.println("primeira conta saldo "+primeiraConta.saldo);
        primeiraConta.tranfere(30,segundaConta);
        System.out.println("Segunda conta saldo "+segundaConta.saldo);
        System.out.println("primeira conta saldo "+primeiraConta.saldo);

        primeiraConta.tranfere(300,segundaConta);
        System.out.println("Segunda conta saldo "+segundaConta.saldo);
        System.out.println("primeira conta saldo "+primeiraConta.saldo);
        primeiraConta.tranfere(-300,segundaConta);
        System.out.println("Segunda conta saldo "+segundaConta.saldo);
        System.out.println("primeira conta saldo "+primeiraConta.saldo);
        segundaConta.tranfere(300,primeiraConta);
        System.out.println("Segunda conta saldo "+segundaConta.saldo);
        System.out.println("primeira conta saldo "+primeiraConta.saldo);
    }

}