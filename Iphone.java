import Implementação.AparelhoTelefonicoImpl;
import Implementação.NavegadorInternetImpl;
import Implementação.ReprodutorMusicalImpl;
import Interfaces.AparelhoTelefonico;
import Interfaces.NavegadorInternet;
import Interfaces.ReprodutorMusical;

public class Iphone {
    public static void main(String[] args) {
        // Usando o Reprodutor Musical
        ReprodutorMusical reprodutor = new ReprodutorMusicalImpl();
        reprodutor.selecionarMusica("Minha Música Favorita");
        reprodutor.tocar();
        reprodutor.pausar();
        
        // Usando o Aparelho Telefônico
        AparelhoTelefonico telefone = new AparelhoTelefonicoImpl();
        telefone.ligar("123-456-789");
        telefone.atender();
        telefone.iniciarCorreioVoz();
        
        // Usando o Navegador na Internet
        NavegadorInternet navegador = new NavegadorInternetImpl();
        navegador.exibirPagina("https://www.exemplo.com");
        navegador.adicionarNovaAba();
        navegador.atualizarPagina();
    }
}
