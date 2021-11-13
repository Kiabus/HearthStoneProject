package eroi;

public abstract class ClasseGuerriero extends EroeBase{

	
	public ClasseGuerriero(String nome, int puntiVita, String specie, String nomeClasse) {
		super(nome, puntiVita, specie, nomeClasse);

	}
	
	public ClasseGuerriero() {
		
	}
	
	@Override
	public String getNomeClasse() {
		return "Guerriero";
	}
	
	@Override
	public String potereEroe() {
		return "Potenziamento Armatura";
		
	}

}
