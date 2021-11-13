package poteri;

public class Mutaforma extends PotereEroi {
	
	public Mutaforma(String nome, int costoMana, String effetto) {
		super(nome, costoMana, effetto);
	}
	
	public Mutaforma() {
		
	}

	@Override
	public String getNomePE() {
		return "Mutaforma";
	}

	@Override
	public String getClassePE() {
		return "Druido";
	}

	@Override
	public int getCostoManaPE() {
		return 2;
	}

	@Override
	public String getEffettoPE() {
		return "Ottieni 1 Armatura e 1 Attacco per il turno attuale";
	}
	
	@Override
	public String toString() {
		return "Nome potere: " + getNomePE() + " - Classe: " + getClassePE() + 
				" - Costo Mana: " + getCostoManaPE() + " - Effetto: " + getEffettoPE();
	}

}
