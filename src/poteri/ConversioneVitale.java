package poteri;

public class ConversioneVitale extends PotereEroi {
	
	public ConversioneVitale(String nome, int costoMana, String effetto) {
		super(nome, costoMana, effetto);
	}
	
	public ConversioneVitale() {

	}

	@Override
	public String getNomePE() {
		return "Conversione Vitale";
	}

	@Override
	public String getClassePE() {
		return "Stregone";
	}

	@Override
	public int getCostoManaPE() {
		return 2;
	}

	@Override
	public String getEffettoPE() {
		return "Pesca una carta al costo di 2 Salute";
	}

	@Override
	public String toString() {
		return "Nome potere: " + getNomePE() + " - Classe: " + getClassePE() + 
				" - Costo Mana: " + getCostoManaPE() + " - Effetto: " + getEffettoPE();
	}
}
