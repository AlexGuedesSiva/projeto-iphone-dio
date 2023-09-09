package projeto_iphone.model;


import projeto_iphone.model.imp.InterfaceNavegadorInternet;

/**
 * Esta classe representa um navegador de internet que implementa a interface InterfaceNavegadorInternet.
 * Ela oferece funcionalidades relacionadas à navegação na web, como exibir páginas, adicionar novas abas e atualizar páginas.
 */
public class NavegadorInternet implements InterfaceNavegadorInternet {

    /**
     * Exibe uma página da web com base na URL especificada.
     *
     * @param url A URL da página da web que deseja exibir.
     */
    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: www." + url);
    }

    /**
     * Adiciona uma nova aba ao navegador.
     */
    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada.");
    }

    /**
     * Atualiza a página da web atualmente exibida no navegador.
     */
    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada.");
    }
}
