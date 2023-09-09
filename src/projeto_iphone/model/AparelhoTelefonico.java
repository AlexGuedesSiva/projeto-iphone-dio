package projeto_iphone.model;


import projeto_iphone.model.imp.InterfaceAparelhoTelefonico;

/**
 * Esta classe representa um aparelho telefônico que implementa a interface
 * InterfaceAparelhoTelefonico. Ela fornece funcionalidades relacionadas a
 * chamadas telefônicas, como ligar, atender chamadas e iniciar correio de voz.
 */
public class AparelhoTelefonico implements InterfaceAparelhoTelefonico {

    /**
     * Inicia uma chamada telefônica para o número especificado.
     *
     * @param numero O número de telefone para o qual deseja ligar.
     */
    @Override
    public void ligar(String numero) {
        System.out.println(numero);
    }

    /**
     * Atende uma chamada telefônica.
     */
    @Override
    public void atender() {
        System.out.println("Atendendo uma ligação");
    }

    /**
     * Inicia o correio de voz para o aparelho telefônico.
     */
    @Override
    public void iniciarCorreioDeVoz() {
        System.out.println("Iniciando correio de Voz");
    }














}
