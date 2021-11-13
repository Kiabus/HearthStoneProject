package poteri;

public class EvocazioneTotemica extends PotereEroi {
	
	public EvocazioneTotemica(String nome, int costoMana, String effetto) {
		super(nome, costoMana, effetto);
	}
	
	public EvocazioneTotemica() {

	}

	@Override
	public String getNomePE() {
		return "Evocazione Totemica";
	}

	@Override
	public String getClassePE() {
		return "Sciamano";
	}

	@Override
	public int getCostoManaPE() {
		return 2;
	}

	@Override
	public String getEffettoPE() {
		return "Evoca casualmente uno tra quattro possibili servitori Totem: Totem della Vita,"
				+ " Totem della Pietra, Totem delle Fiamme e Totem dell'Aria";
	}
	
	@Override
	public String toString() {
		return "Nome potere: " + getNomePE() + " - Classe: " + getClassePE() + 
				" - Costo Mana: " + getCostoManaPE() + " - Effetto: " + getEffettoPE();
	}
}
