package eroi;

public abstract class ClasseMago extends EroeBase {
	

	public ClasseMago(String nome, int puntiVita, String specie, String nomeClasse) {
		super(nome, puntiVita, specie, nomeClasse);
		
	}
	
	public ClasseMago() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String getNomeClasse() {
		return "Mago";
	}

	@Override
	public String potereEroe() {
		return "Detonazione di Fuoco";
	}

}
