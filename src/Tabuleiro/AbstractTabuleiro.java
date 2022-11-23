package Tabuleiro;

import java.util.List;

import Carta.Ataque;
import Domain.AbstractJogador;

public abstract class AbstractTabuleiro implements Tabuleiro {
	
	protected List<AbstractJogador> jogadores;
	protected Integer limiteJogador;

	@Override
	public void inserirUmJogador(AbstractJogador jogador) {
		if (jogadores.size() < limiteJogador) {
			jogadores.add(jogador);
		}
	}

	@Override
	public Boolean avaliarCartaAtaque(Ataque cartaAtaque) {
		return null;
	}

	@Override
	public Boolean avaliarSeJogadorVenceu(Integer vida) {
		return null;
	}
	
	

}
