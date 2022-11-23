package Tabuleiro;

import Carta.Ataque;
import Domain.AbstractJogador;

public interface Tabuleiro {

	public abstract void inserirUmJogador(AbstractJogador jogador);
	public Boolean avaliarCartaAtaque(Ataque cartaAtaque);
	public Boolean avaliarSeJogadorVenceu(Integer vida);
	
	
}
