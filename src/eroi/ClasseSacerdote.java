package eroi;

public abstract class ClasseSacerdote extends EroeBase {
	

	public ClasseSacerdote(String nome, int puntiVita, String specie, String nomeClasse) {
		super(nome, puntiVita, specie, nomeClasse);
		
	}
	
	public ClasseSacerdote() {
		
	}
	
	@Override
	public String getNomeClasse() {
		return "Sacerdote";
	}

	@Override
	public String potereEroe() {
		return "Cura Inferiore";
	}

}
