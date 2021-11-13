package poteri;

public class ArtigliDemoniaci extends PotereEroi {
	
	public ArtigliDemoniaci(String nome, int costoMana, String effetto) {
		super(nome, costoMana, effetto);
	}
	
	public ArtigliDemoniaci() {
		
	}

	@Override
	public String getNomePE() {
		return "Artigli Demoniaci";
	}

	@Override
	public String getClassePE() {
		return "Cacciatore di Demoni";
	}

	@Override
	public int getCostoManaPE() {
		return 1;
	}

	@Override
	public String getEffettoPE() {
		return "Ottieni 1 Attacco per il turno attuale";
	}
	
	@Override
	public String toString() {
		return "Nome potere: " + getNomePE() + " - Classe: " + getClassePE() + 
				" - Costo Mana: " + getCostoManaPE() + " - Effetto: " + getEffettoPE();
	}

}
