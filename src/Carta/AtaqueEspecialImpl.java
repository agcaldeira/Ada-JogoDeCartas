package Carta;

import java.util.List;

public class AtaqueEspecialImpl extends AtaqueImpl implements AtaqueEspecial, Efeito {
	
	List<EfeitoCarta> efeitos;

	@Override
	public List<EfeitoCarta> exibirEfeitos() {
		return null;
	}

	public AtaqueEspecialImpl(String nome, String tipo, Integer custo, Integer poder, Integer resistencia,
			List<EfeitoCarta> efeitos) {
		super(nome, tipo, custo, poder, resistencia);
		this.efeitos = efeitos;
	}
	

}
