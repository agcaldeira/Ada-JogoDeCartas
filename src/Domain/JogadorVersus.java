package Domain;

import Deck.DeckVersus;

public class JogadorVersus extends AbstractJogador {
	
	public JogadorVersus(String nome, Integer vida) {
		super(nome, vida);
		this.deck = new DeckVersus();
	}

}
