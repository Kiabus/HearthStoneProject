package poteri;

public class TiroStabilizzato extends PotereEroi {
	
	public TiroStabilizzato(String nome, int costoMana, String effetto) {
		super(nome, costoMana, effetto);
	}
	
	public TiroStabilizzato() {
		
	}

	@Override
	public String getNomePE() {
		return "Tiro Stabilizzato";
	}
	
	@Override
	public String getClassePE() {
		return "Cacciatore";
	}

	@Override
	public int getCostoManaPE() {
		return 2;
	}

	@Override
	public String getEffettoPE() {
		return "Infligge 2 danni all'eroe nemico";
	}
	
	@Override
	public String toString() {
		return "Nome potere: " + getNomePE() + " - Classe: " + getClassePE() + 
				" - Costo Mana: " + getCostoManaPE() + " - Effetto: " + getEffettoPE();
	}

}
