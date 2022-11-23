package Deck;

import java.util.List;

import Carta.AbstractCarta;

public abstract class AbstractDeck {
	
	private List<AbstractCarta> cartas;
	protected Integer quantidadeCartas;

	List<AbstractCarta> getCartas() {
		return cartas;
	}

	void setCartas(List<AbstractCarta> cartas) {
		this.cartas = cartas;
	}
	
	
	public List<AbstractDeck>gerarDeck(){
		return null;	
	}
	
	

}
