public class Main {
    
    public static void main(String[] args) {
        
        var cliente = new Cliente();
        cliente.setNome("Carlos Reis");

        var cc = new ContaCorrente(cliente);
        var cp = new ContaPoupanca(cliente);

        cc.depositar(100);

        cc.imprimirExtrato();
        cp.imprimirExtrato();

        cc.transferir(50, cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}
