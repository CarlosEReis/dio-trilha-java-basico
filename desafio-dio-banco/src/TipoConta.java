public enum TipoConta {
    
    CONTA_CORRENTE("Conta Corrente"),
    CONTA_POUPANCA("Conta Poupança");

    private String  descricao;

    TipoConta(String decricao) {
        this.descricao = decricao;
    }

    public String getDescricao() {
        return descricao;
    }
}