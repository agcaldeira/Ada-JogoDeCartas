package Domain;

public class Jogador {
	
	private String nome;
	private Integer vida;
	private Deck deck;
	
	String getNome() {
		return nome;
	}
	void setNome(String nome) {
		this.nome = nome;
	}
	Integer getVida() {
		return vida;
	}
	void setVida(Integer vida) {
		this.vida = vida;
	}
	Deck getDeck() {
		return deck;
	}
	void setDeck(Deck deck) {
		this.deck = deck;
	}
	
}