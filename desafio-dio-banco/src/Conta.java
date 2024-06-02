public abstract class Conta implements IConta {

    private final static int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected Integer numero;
    protected double saldo;
    protected Cliente cliente;
    private StatusConta status;

    public Conta(Cliente cliente) {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
        this.status = StatusConta.INATIVA;
    }

    public int getAgencia() {
        return agencia;
    }

    public Integer getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setStatus(StatusConta status) {
        this.status = status;
    }

    public StatusConta getStatus() {
        return status;
    }

    @Override
    public boolean isAtiva() {
        return status.equals(StatusConta.ATIVA) ? true : false;
    }

    @Override
    public boolean isInativa() {
        return !isAtiva();
    }

    @Override
    public void sacar(double valor) {
        saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    protected void imprimirInfoComuns() {
        System.out.println(String.format("Títular: %s", cliente.getNome()));
        System.out.println(String.format("Agencia: %d", agencia));
        System.out.println(String.format("Número: %d", numero));
        System.out.println(String.format("Saldo: %.2f\n", saldo));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + agencia;
        result = prime * result + numero;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Conta other = (Conta) obj;
        if (agencia != other.agencia)
            return false;
        if (numero != other.numero)
            return false;
        return true;
    }

    
}
