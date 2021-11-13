package eroi;

public abstract class ClasseDruido extends EroeBase {

	public ClasseDruido(String nome, int puntiVita, String specie, String nomeClasse) {
		super(nome, puntiVita, specie, nomeClasse);
		
	}
	
	public ClasseDruido() {
		
	}
	
	@Override
	public String getNomeClasse() {
		return "Druido";
	}
	
	@Override
	public String potereEroe() {
		return "Mutaforma";
		
	}

}
