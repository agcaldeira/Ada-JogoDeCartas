package Carta;

public abstract class AbstractCarta implements Carta {
	
	private String nome;
	private String tipo;
	private Integer custo;

	@Override
	public String verNome() {
		return null;
	}

	@Override
	public String verTipo() {
		return null;
	}

	@Override
	public String verCusto() {
		return null;
	}

	String getNome() {
		return nome;
	}

	void setNome(String nome) {
		this.nome = nome;
	}

	String getTipo() {
		return tipo;
	}

	void setTipo(String tipo) {
		this.tipo = tipo;
	}

	Integer getCusto() {
		return custo;
	}

	void setCusto(Integer custo) {
		this.custo = custo;
	}
	
	

}
