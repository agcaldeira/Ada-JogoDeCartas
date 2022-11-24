package Deck;

import java.util.List;

import Carta.AbstractCarta;
import Carta.AtaqueEspecialImpl;
import Carta.AtaqueImpl;
import Carta.EfeitoCarta;

public abstract class AbstractDeck {
	
	private List<AbstractCarta> cartas;
	private Integer quantidadeCartas;

	List<AbstractCarta> getCartas() {
		return cartas;
	}

	void setCartas(List<AbstractCarta> cartas) {
		this.cartas = cartas;
	}
	
	
	private void gerarDeck(){
		this.cartas.add(new AtaqueEspecialImpl("nome", "tipo", quantidadeCartas, quantidadeCartas, quantidadeCartas, List.of(new EfeitoCarta("nome",10))));
		this.cartas.add(new AtaqueImpl("nome", "tipo", quantidadeCartas, quantidadeCartas, quantidadeCartas));
	}
	
	public AbstractDeck(Integer quantidadeCartas){
		this.quantidadeCartas = quantidadeCartas;
		this.gerarDeck();
	}
	
	

}
