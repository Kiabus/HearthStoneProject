package poteri;

public class DetonazioneFuoco extends PotereEroi {
	
	public DetonazioneFuoco(String nome, int costoMana, String effetto) {
		super(nome, costoMana, effetto);
	}
	
	public DetonazioneFuoco() {

	}

	@Override
	public String getNomePE() {
		return "Detonazione di Fuoco";
	}

	@Override
	public String getClassePE() {
		return "Mago";
	}

	@Override
	public int getCostoManaPE() {
		return 2;
	}

	@Override
	public String getEffettoPE() {
		return "Infligge 1 danno a qualsiasi bersaglio";
	}
	
	@Override
	public String toString() {
		return "Nome potere: " + getNomePE() + " - Classe: " + getClassePE() + 
				" - Costo Mana: " + getCostoManaPE() + " - Effetto: " + getEffettoPE();
	}

}
