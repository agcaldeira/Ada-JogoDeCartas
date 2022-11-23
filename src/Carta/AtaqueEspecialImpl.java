package Carta;

import java.util.List;

public class AtaqueEspecialImpl extends AtaqueImpl implements AtaqueEspecial, Efeito {
	
	List<Integer> efeitos;

	@Override
	public List<EfeitoCarta> exibirEfeitos() {
		return null;
	}

}
