package eroi;

public abstract class ClasseSciamano extends EroeBase {

	public ClasseSciamano(String nome, int puntiVita, String specie, String nomeClasse) {
		super(nome, puntiVita, specie, nomeClasse);
		
	}
	
	public ClasseSciamano() {
		
	}
	
	@Override
	public String getNomeClasse() {
		return "Sciamano";
	}
	
	@Override
	public String potereEroe() {
		return "Evocazione Totemica";
		
	}

}
