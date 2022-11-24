package Carta;

public class AtaqueImpl extends AbstractCarta implements Ataque {

	public AtaqueImpl(String nome, String tipo, Integer custo, Integer poder, Integer resistencia) {
		super(nome, tipo, custo);
		this.poder = poder;
		this.resistencia = resistencia;
	}

	private Integer poder;
	private Integer resistencia;
	
	Integer getPoder() {
		return poder;
	}

	void setPoder(Integer poder) {
		this.poder = poder;
	}

	Integer getResistencia() {
		return resistencia;
	}

	void setResistencia(Integer resistencia) {
		this.resistencia = resistencia;
	}

	@Override
	public String verPoder() {
		return null;
	}

	@Override
	public String verResistencia() {
		return null;
	}
	
}
