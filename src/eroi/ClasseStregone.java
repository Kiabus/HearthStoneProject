package eroi;

public abstract class ClasseStregone extends EroeBase {
	
	public ClasseStregone(String nome, int puntiVita, String specie, String nomeClasse) {
		super(nome, puntiVita, specie, nomeClasse);
		
	}
	
	public ClasseStregone() {
		
	}
	
	@Override
	public String getNomeClasse() {
		return "Stregone";
	}
	
	@Override
	public String potereEroe() {
		return "Conversione Vitale";
		
	}

	
}
