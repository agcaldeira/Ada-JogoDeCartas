package Carta;

public class EfeitoCarta {
	
	private String nome;
	private Integer poder;
	
	String getNome() {
		return nome;
	}
	void setNome(String nome) {
		this.nome = nome;
	}
	Integer getPoder() {
		return poder;
	}
	void setPoder(Integer poder) {
		this.poder = poder;
	}
	
	public EfeitoCarta(String nome, Integer poder) {
		super();
		this.nome = nome;
		this.poder = poder;
	}
	
}
