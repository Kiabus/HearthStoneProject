package carte;

public class MarchioCacciatore extends Magia {
	
	public MarchioCacciatore(String nome, String classe, int costoMana, String effetto) {
		super(nome, classe, costoMana, effetto);
	}

	public MarchioCacciatore() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getNome() {
		return "Marchio del Cacciatore";
	}

	@Override
	public String getClasse() {
		return "Cacciatore";
	}

	@Override
	public int getCostoMana() {
		return 0;
	}

	@Override
	public String getEffetto() {
		return "Imposta la salute di un servitore a 1";
	}
	
	@Override
	public int getAttacco() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getDifesa() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String toString() {
		return "Info carta: " + getNome() + " - Tipo " + getTipo() + " - Classe " + getClasse() + " - Costo Mana " + getCostoMana() +
				" - Attacco " + getAttacco() + " - Difesa " + getDifesa() + " - " + getEffetto();
	}

	

}
