package eroi;

public abstract class ClassePaladino extends EroeBase {

	public ClassePaladino(String nome, int puntiVita, String specie, String nomeClasse) {
		super(nome, puntiVita, specie, nomeClasse);
	}
	
	public ClassePaladino() {
		
	}
	
	@Override
	public String getNomeClasse() {
		return "Paladino";
	}
	
	@Override
	public String potereEroe() {
		return "Rinforzo";	
	}

}
