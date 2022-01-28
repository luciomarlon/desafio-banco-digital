public class Principal {

    public static void main(String[] args) {

        Cliente lucio = new Cliente();
        lucio.setNomecliente("LÚCIO MARLON OLIVEIRA DE SOUSA");

        iConta cc = new ContaCorrente(lucio);
        iConta poupanca = new ContaPoupanca(lucio);

        cc.depositar(1000);
        cc.transferir(100, poupanca);


        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }

}
