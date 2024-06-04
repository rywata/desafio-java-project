
public class Main {

    public static void main(String[] args) {
        Cliente abestaldo = new Cliente("Abestaldo", "12345678900");
        abestaldo.setNome("Abestaldo");

        Conta cc = new ContaCorrente(abestaldo);
        Conta poupanca = new ContaPoupanca(abestaldo);

        cc.depositar(100);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }

}