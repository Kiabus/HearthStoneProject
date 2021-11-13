package eroi;

public abstract class ClasseCacciatoreDemoni extends EroeBase {
	
	public ClasseCacciatoreDemoni(String nome, int puntiVita, String specie, String nomeClasse) {
		super(nome, puntiVita, specie, nomeClasse);
	}
	
	public ClasseCacciatoreDemoni() {
		
	}
	
	@Override
	public String getNomeClasse() {
		return "Cacciatore di Demoni";
	}
	
	@Override
	public String potereEroe() {
		return "Artigli Demoniaci";
		
	}

}
