package Domain;

import java.util.ArrayList;

public class TabuleiroParty extends AbstractTabuleiro {
	
	public TabuleiroParty() {
		jogadores = new ArrayList<>();
	}

	@Override
	public void inserirUmJogador(Jogador jogador) {
		if (jogadores.size() < 5) {
			jogadores.add(jogador);
		}
	}

}
