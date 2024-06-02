import java.util.Map;
import java.util.TreeMap;

public class Banco {

    private String nome;
    private Map<Integer, Conta> contas;

    public Banco(String nome) {
        this.nome = nome;
        this.contas = new TreeMap<>();
    }

    public String getNome() {
        return nome;
    }

    public void registrarConta(Conta conta, StatusConta status) {
        if (StatusConta.ATIVA.equals(conta.getStatus())) {
            boolean isContaAtivaValida = false; 
            // valida dados na Receita Federal...
            // Valida Score no Serasa
            // Realiza avaliação de crédito     
            isContaAtivaValida = true;        
            contas.put(conta.numero, conta);
        }

    }

    
    
}
