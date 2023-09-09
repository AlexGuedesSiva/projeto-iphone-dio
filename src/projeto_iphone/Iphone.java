package projeto_iphone;

import projeto_iphone.services.AparelhoTelefonico;
import projeto_iphone.services.NavegadorInternet;
import projeto_iphone.services.ReprodutorDeMusica;

/**
 * Esta classe representa um modelo simplificado de um iPhone, que possui
 * funcionalidades como chamadas telefônicas, navegação na web e reprodução de
 * música.
 */
public class Iphone {

    private final NavegadorInternet navegador;
    private final AparelhoTelefonico aparelho;
    private final ReprodutorDeMusica reprodutorDeMusica;

    /**
     * Construtor para criar uma instância de iPhone com os objetos de navegador,
     * aparelho e reprodutor de música.
     *
     * @param navegador          O navegador de internet associado ao iPhone.
     * @param aparelho           O aparelho telefônico associado ao iPhone.
     * @param reprodutorDeMusica O reprodutor de música associado ao iPhone.
     */
    public Iphone(NavegadorInternet navegador, AparelhoTelefonico aparelho, ReprodutorDeMusica reprodutorDeMusica) {
        this.navegador = navegador;
        this.aparelho = aparelho;
        this.reprodutorDeMusica = reprodutorDeMusica;
    }


    public static void main(String[] args) {
        // Crie instâncias
        NavegadorInternet navegador = new NavegadorInternet();
        AparelhoTelefonico aparelho = new AparelhoTelefonico();
        ReprodutorDeMusica reprodutorMusica = new ReprodutorDeMusica();

        reprodutorMusica.adicionarMusica("See You Again");
        reprodutorMusica.adicionarMusica("Something in the way");

        // Crie uma instância de iphone.
        Iphone iphone = new Iphone(navegador, aparelho, reprodutorMusica);

        System.out.println();
        // Exemplo de uso aparelho telefonico
        iphone.aparelho.ligar("555-444");
        iphone.aparelho.atender();
        iphone.aparelho.iniciarCorreioDeVoz();
        System.out.println();

        // Exemplo de uso navegador web.
        iphone.navegador.exibirPagina("google.com");
        iphone.navegador.adicionarNovaAba();
        iphone.navegador.atualizarPagina();
        System.out.println();

        // Exemplo de uso reprodutor de música.
        iphone.reprodutorDeMusica.selecionarMusica("See You Again");
        iphone.reprodutorDeMusica.selecionarMusica("Something in the way");
        iphone.reprodutorDeMusica.tocar();
        iphone.reprodutorDeMusica.pausar();
    }
}
