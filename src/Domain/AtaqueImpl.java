package Domain;

public class AtaqueImpl extends AbstractCarta implements Ataque {

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
