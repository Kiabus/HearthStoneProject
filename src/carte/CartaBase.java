package carte;

public abstract class CartaBase {
	
	private String nome;
	private String classe;
	private int costoMana;
	private String effetto;
	
	public CartaBase(String nome, String classe, int costoMana, String effetto) {
		this.nome = nome;
		this.classe = classe;
		this.costoMana = costoMana;
		this.effetto = effetto;
	}
	
	public CartaBase() {
		// TODO Auto-generated constructor stub
	}
	
	public abstract String getNome();
	
	public abstract String getClasse();
	
	public abstract String getTipo();

	public abstract int getCostoMana();
	
	public abstract String getEffetto();
	
	public abstract int getAttacco();
	
	public abstract int getDifesa();
	
}
