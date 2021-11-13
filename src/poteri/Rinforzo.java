package poteri;

public class Rinforzo extends PotereEroi {
	
	public Rinforzo(String nome, int costoMana, String effetto) {
		super(nome, costoMana, effetto);
	}
	
	public Rinforzo() {

	}

	@Override
	public String getNomePE() {
		return "Rinforzo";
	}

	@Override
	public String getClassePE() {
		return "Paladino";
	}

	@Override
	public int getCostoManaPE() {
		return 2;
	}

	@Override
	public String getEffettoPE() {
		return "Evoca un servitore Recluta Mano d'Argento 1/1";
	}

	@Override
	public String toString() {
		return "Nome potere: " + getNomePE() + " - Classe: " + getClassePE() + 
				" - Costo Mana: " + getCostoManaPE() + " - Effetto: " + getEffettoPE();
	}
}
