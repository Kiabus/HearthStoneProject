package poteri;

public class CuraInferiore extends PotereEroi {
	
	public CuraInferiore(String nome, int costoMana, String effetto) {
		super(nome, costoMana, effetto);
	}
	
	public CuraInferiore() {

	}

	@Override
	public String getNomePE() {
		return "Cura Inferiore";
	}

	@Override
	public String getClassePE() {
		return "Sacerdote";
	}

	@Override
	public int getCostoManaPE() {
		return 2;
	}

	@Override
	public String getEffettoPE() {
		return "Rigenera 2 Salute a qualunque bersaglio sul tabellone";
	}
	
	@Override
	public String toString() {
		return "Nome potere: " + getNomePE() + " - Classe: " + getClassePE() + 
				" - Costo Mana: " + getCostoManaPE() + " - Effetto: " + getEffettoPE();
	}
}
