package Domain;

import java.util.ArrayList;

public class TabuleiroVersus extends AbstractTabuleiro {
	
	public TabuleiroVersus() {
		jogadores = new ArrayList<>();
	}

	@Override
	public void inserirUmJogador(Jogador jogador) {
		if (jogadores.size() < 2) {
			jogadores.add(jogador);
		}
	}

}
