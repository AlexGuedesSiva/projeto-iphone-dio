package projeto_iphone.model;

import projeto_iphone.model.imp.InterfaceReprodutorMusical;

import java.util.ArrayList;
import java.util.List;



/**
 * Esta classe representa um reprodutor de música que implementa a interface InterfaceReprodutorMusical.
 * Ela oferece funcionalidades relacionadas à reprodução de música, como tocar, pausar e selecionar músicas da lista.
 */
public class ReprodutorDeMusica implements InterfaceReprodutorMusical {

	private List<String> listaDeMusicas;

	/**
     * Construtor padrão que inicializa a lista de músicas.
     */
	public ReprodutorDeMusica() {
		super();
		this.listaDeMusicas = new ArrayList<String>();
	}
	
	/**
     * Adiciona uma música à lista de reprodução.
     *
     * @param musica O nome da música a ser adicionada à lista de reprodução.
     */
	public void adicionarMusica(String musica) {
		listaDeMusicas.add(musica);
	}

	/**
     * Toca a música atualmente selecionada.
     */
	@Override
	public void tocar() {
		System.out.println("Tocando música.");
		// Adicione a lógica para iniciar a reprodução da música aqui
	}

	/**
     * Pausa a reprodução da música.
     */
	@Override
	public void pausar() {
		System.out.println("Pausando música.");
		// Adicione a lógica para pausar a reprodução da música aqui
	}

	/**
     * Seleciona uma música da lista de reprodução para reprodução.
     *
     * @param musica O nome da música a ser selecionada.
     */
	@Override
	public void selecionarMusica(String musica) {
		// Adicionar musica com base em uma lista de Array.
		if (listaDeMusicas.contains(musica)) {
			System.out.println("Selecionando música: " + musica);
			// Adicione a lógica para selecionar a música aqui
		} else {
			System.out.println("Música não encontrada na lista.");
			// Adicione a lógica para lidar com o caso em que a música não está na lista
		}
	}
	

	// Outros métodos da interface e outras funcionalidades da classe...
}
