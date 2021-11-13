package poteri;

public class PotenziamentoArmatura extends PotereEroi {
	
	public PotenziamentoArmatura(String nome, int costoMana, String effetto) {
		super(nome, costoMana, effetto);
	}
	
	public PotenziamentoArmatura() {

	}

	@Override
	public String getNomePE() {
		return "Potenziamento Armatura";
	}

	@Override
	public String getClassePE() {
		return "Guerriero";
	}

	@Override
	public int getCostoManaPE() {
		return 2;
	}

	@Override
	public String getEffettoPE() {
		return "Fornisce 2 Armatura. Funziona come salute aggiuntiva e si può accumulare senza alcun limite";
	}
	
	@Override
	public String toString() {
		return "Nome potere: " + getNomePE() + " - Classe: " + getClassePE() + 
				" - Costo Mana: " + getCostoManaPE() + " - Effetto: " + getEffettoPE();
	}

}
