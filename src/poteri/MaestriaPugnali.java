package poteri;

public class MaestriaPugnali extends PotereEroi {
	
	public MaestriaPugnali(String nome, int costoMana, String effetto) {
		super(nome, costoMana, effetto);
	}
	
	public MaestriaPugnali() {

	}

	@Override
	public String getNomePE() {
		return "Maestria nei Pugnali";
	}

	@Override
	public String getClassePE() {
		return "Ladro";
	}

	@Override
	public int getCostoManaPE() {
		return 2;
	}

	@Override
	public String getEffettoPE() {
		return "Equipaggia un'Arma con 1 Attacco e 2 Integrità";
	}
	
	@Override
	public String toString() {
		return "Nome potere: " + getNomePE() + " - Classe: " + getClassePE() + 
				" - Costo Mana: " + getCostoManaPE() + " - Effetto: " + getEffettoPE();
	}
}
