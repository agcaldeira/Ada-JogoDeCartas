package Tabuleiro;

import java.util.List;

import Carta.AtaqueImpl;
import Domain.AbstractJogador;

public abstract class AbstractTabuleiro implements Tabuleiro {
	
	protected List<AbstractJogador> jogadores;
	protected List<AtaqueImpl> cartas;
	protected Integer limiteJogador;
	protected Integer limiteCarta;

	@Override
	public void inserirUmJogador(AbstractJogador jogador) {
		if (jogadores.size() < limiteJogador) {
			jogadores.add(jogador);
		}
	}

	@Override
	public Boolean avaliarCartaAtaque(AtaqueImpl cartaAtaque) {
		if(cartas.size() < limiteCarta) {
			cartas.add(cartaAtaque);
			return true;
		}	
		return false;
	}

	@Override
	public Boolean avaliarSeJogadorVenceu(Integer vida) {
		return null;
	}
	
	
	

}
