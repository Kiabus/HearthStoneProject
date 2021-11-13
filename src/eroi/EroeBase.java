package eroi;

public abstract class EroeBase {

	private String nome;
	private String specie;
	private int puntiVita;
	private String nomeClasse;
	
	public EroeBase(String nome, int puntiVita, String specie, String nomeClasse){
		this.nome = nome;
		this.puntiVita = puntiVita;
		this.specie = specie;
		this.nomeClasse = nomeClasse;
	}
	
	public EroeBase() {
		
	}

	public abstract String getNome();
	
	public abstract String getSpecie();
	
	public int getPuntiVita(){
		
		return 30;
	}

	//public abstract void setPuntiVita(int puntiVita);
	
	public abstract String getNomeClasse();
	
	public abstract String battutaEroe();
	
	public abstract String potereEroe();
	
}
