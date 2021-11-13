package carte;

public abstract class Servitore extends CartaBase {

	public Servitore(String nome, String classe, String tipo, int costoMana, String effetto) {
		super(nome, classe, costoMana, effetto);
	}
	
	public Servitore() {
		// TODO Auto-generated constructor stub
	}
	
	public abstract String getNome();
	
	public abstract String getClasse();
	
	@Override
	public String getTipo() {
		return "Servitore";
	}

	public abstract int getCostoMana();
	
	public abstract String getEffetto();
	
	public abstract int getAttacco();
	
	public abstract int getDifesa();
}
