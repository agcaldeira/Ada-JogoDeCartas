package Domain;

import Deck.AbstractDeck;

public abstract class AbstractJogador {
	
	private String nome;
	private Integer vida;
	protected AbstractDeck deck;
	
	
	String getNome() {
		return nome;
	}
	void setNome(String nome) {
		this.nome = nome;
	}
	Integer getVida() {
		return vida;
	}
	void setVida(Integer vida) {
		this.vida = vida;
	}
	AbstractDeck getDeck() {
		return deck;
	}
	void setDeck(AbstractDeck deck) {
		this.deck = deck;
	}
	
}