public enum StatusConta {
    
    ATIVA("Ativa"),
    INATIVA("Inativa");

    private String descricao;

    StatusConta(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
