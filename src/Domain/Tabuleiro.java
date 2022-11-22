package Domain;

public interface Tabuleiro {

	public abstract void inserirUmJogador(Jogador jogador);
	public Boolean avaliarCartaAtaque(Ataque cartaAtaque);
	public Boolean avaliarSeJogadorVenceu(Integer vida);	
	
}
