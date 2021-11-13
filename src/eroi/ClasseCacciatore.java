package eroi;

public abstract class ClasseCacciatore extends EroeBase {

	public ClasseCacciatore(String nome, int puntiVita, String specie, String nomeClasse) {
		super(nome, puntiVita, specie, nomeClasse);
	}
	
	public ClasseCacciatore() {
		
	}

	@Override
	public String getNomeClasse() {
		return "Cacciatore";
	}

	@Override
	public String potereEroe() {
		return "Tiro Stabilizzato";
		
	}

}
