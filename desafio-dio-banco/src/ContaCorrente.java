public class ContaCorrente extends Conta {

    private final double SALDO_PARA_ATIVACAO = 20.0;

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Corrente ===");
        super.imprimirInfoComuns();
    }

    @Override
    public void ativar() {
        if (saldo >= SALDO_PARA_ATIVACAO) {
            super.setStatus(StatusConta.ATIVA);
        } else {
            new RuntimeException("Saldo para ativação insuficiente.");
        }
    }

    @Override
    public void desativar() {
        if (super.getStatus().equals(StatusConta.ATIVA)) {
            super.setStatus(StatusConta.INATIVA);            
        }

    }

}
