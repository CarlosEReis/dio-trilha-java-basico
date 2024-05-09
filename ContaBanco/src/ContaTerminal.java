import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {

        System.out.println("\n\n");
        System.out.println("  _____            _        ____");
        System.out.println(" / ____|          | |      |  _ \\");                       
        System.out.println("| |     ___  _ __ | |_ __ _| |_) | __ _ _ __   ___ ___");
        System.out.println("| |    / _ \\| '_ \\| __/ _` |  _ < / _` | '_ \\ / __/ _ \\"); 
        System.out.println("| |___| (_) | | | | || (_| | |_) | (_| | | | | (_| (_) |");
        System.out.println(" \\_____\\___/|_| |_|\\__\\__,_|____/ \\__,_|_| |_|\\___\\___/");
        System.out.println("\nCreated by: Carlos E Reis");
        System.out.println("v1.0.0");
        System.out.println("\n");

        var conta = new Conta(); 

        var scanner = new Scanner(System.in);

        System.out.println("Digite o número da conta: ");
        conta.setNumero(scanner.nextInt());
        scanner.nextLine();
        
        System.out.println("\nDigite o número da agência: ");
        conta.setAgencia(scanner.nextLine());

        System.out.println("\n2Certo. Agora confirme o nome do titular da conta: ");
        conta.setCliente(scanner.nextLine());

        System.out.println("\nOk. Agora me diga o saldo: ");
        conta.setSaldo(scanner.nextDouble());
        scanner.nextLine();

        var msg = String.format(
            "\nOlá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %s já está disponível para saque.", 
        conta.getCliente(), 
        conta.getAgencia(), 
        conta.getNumero(),
        conta.getSaldo());

        System.out.println(msg);
        System.out.println("\n\n\n");
    }

}

class Conta {
        
    private int numero = 0;
    private String agencia = "";
    private String cliente = "";
    private Double saldo = 0.0;

    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public String getAgencia() {
        return agencia;
    }
    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }
    public String getCliente() {
        return cliente;
    }
    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
    public Double getSaldo() {
        return saldo;
    }
    
    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    
}
