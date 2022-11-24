package Tabuleiro;

import Carta.AtaqueImpl;
import Domain.AbstractJogador;

public interface Tabuleiro {

	public abstract void inserirUmJogador(AbstractJogador jogador);
	public Boolean avaliarCartaAtaque(AtaqueImpl cartaAtaque);
	public Boolean avaliarSeJogadorVenceu(Integer vida);
	
	
}
