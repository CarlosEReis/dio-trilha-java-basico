import com.carloser7.model.Iphone;

public class Main {
    public static void main(String[] args) throws Exception {

        System.out.println("\n\n");

        var iPhone = new Iphone();

        Thread.sleep(1000);
        iPhone.getReprodutorMusical().selecionarMusica("Red Hot Chili Peppers: Otherside");
        Thread.sleep(1000);
        iPhone.getReprodutorMusical().tocar();
        Thread.sleep(1000);
        iPhone.getReprodutorMusical().pausar();

        System.out.println("\n\n");
        Thread.sleep(1500);

        iPhone.getBrowser().adicionarNovaAba();
        Thread.sleep(1000);
        iPhone.getBrowser().exibirPagina("https://carlosereis.github.io/portifolio/");
        Thread.sleep(1000);
        iPhone.getBrowser().atualizarPagina();

        System.out.println("\n\n");
        Thread.sleep(1500);

        iPhone.getTelefone().ligar("(xx) X.XXXX-XXXX");
        Thread.sleep(1000);
        iPhone.getTelefone().atender();
        Thread.sleep(1000);
        iPhone.getTelefone().iniciarCorreioVoz();

    }
}
