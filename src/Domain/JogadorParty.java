package Domain;

import Deck.DeckParty;

public class JogadorParty extends AbstractJogador{
	
	public JogadorParty(String nome, Integer vida) {
		super(nome, vida);
		this.deck = new DeckParty();
	}
	
	

}
