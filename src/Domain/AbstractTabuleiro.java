package Domain;

import java.util.List;

public abstract class AbstractTabuleiro implements Tabuleiro {
	
	protected List<Jogador> jogadores;

	@Override
	public abstract void inserirUmJogador(Jogador jogador);

	@Override
	public Boolean avaliarCartaAtaque(Ataque cartaAtaque) {
		return null;
	}

	@Override
	public Boolean avaliarSeJogadorVenceu(Integer vida) {
		return null;
	}
	
	

}
