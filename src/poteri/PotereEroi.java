package poteri;

public abstract class PotereEroi {
	
	private String nome; 
	private String classe;
	private int costoMana;
	private String effetto;
	
	public PotereEroi(String nome, int costoMana, String effetto) {
		this.nome = nome;
		this.costoMana = costoMana;
		this.effetto = effetto;	
	}
	
	public PotereEroi() {
		
	}
	
	public abstract String getNomePE();
	
	public abstract String getClassePE();
	
	public abstract int getCostoManaPE();
	
	public abstract String getEffettoPE();

}
