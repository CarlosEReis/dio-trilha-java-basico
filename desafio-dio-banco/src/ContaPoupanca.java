public class ContaPoupanca extends Conta{

    public ContaPoupanca(Cliente cliente) {
       super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Poupança ===");
        super.imprimirInfoComuns();
    }

    @Override
    public void ativar() {
        if (saldo >= 0) {
            super.setStatus(StatusConta.ATIVA);
        } else {
            new RuntimeException("Conta não pode ser ativada, saldo negativo.");
        }
    }

    @Override
    public void desativar() {
        super.setStatus(StatusConta.INATIVA);
    }
}
