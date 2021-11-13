package carte;

public abstract class Segreto extends CartaBase {

	public Segreto(String nome, String classe, String tipo, int costoMana, String effetto) {
		super(nome, classe, costoMana, effetto);
	}
	
	public Segreto() {
		// TODO Auto-generated constructor stub
	}
	
	public abstract String getNome();
	
	public abstract String getClasse();
	
	@Override
	public String getTipo() {
		return "Segreto";
	}

	public abstract int getCostoMana();
	
	public abstract String getEffetto();
}
