package Domain;

import java.util.List;

public class Deck {
	
	private List<AbstractCarta> cartas;

	List<AbstractCarta> getCartas() {
		return cartas;
	}

	void setCartas(List<AbstractCarta> cartas) {
		this.cartas = cartas;
	}

}
