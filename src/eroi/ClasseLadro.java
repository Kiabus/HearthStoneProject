package eroi;

public abstract class ClasseLadro extends EroeBase {
	
	public ClasseLadro(String nome, int puntiVita, String specie, String nomeClasse) {
		super(nome, puntiVita, specie, nomeClasse);
		
	}
	
	public ClasseLadro() {

	}
	
	@Override
	public String getNomeClasse() {
		return "Ladro";
	}
	
	@Override
	public String potereEroe() {
		return "Maestria nei Pugnali";		
	}

}
