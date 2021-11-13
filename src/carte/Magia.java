package carte;

public abstract class Magia extends CartaBase {
	
	public Magia(String nome, String classe, int costoMana, String effetto) {
		super(nome, classe, costoMana, effetto);
	}
	
	public Magia() {
		// TODO Auto-generated constructor stub
	}
	
	public abstract String getNome();
	
	public abstract String getClasse();
	
	@Override
	public String getTipo() {
		return "Magia";
	}

	public abstract int getCostoMana();
	
	public abstract String getEffetto();

}
