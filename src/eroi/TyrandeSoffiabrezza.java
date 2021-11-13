package eroi;

public class TyrandeSoffiabrezza extends ClasseSacerdote {

	public TyrandeSoffiabrezza(String nome, int puntiVita, String specie, String nomeClasse) {
		super(nome, puntiVita, specie, nomeClasse);
	
	}
	
	public TyrandeSoffiabrezza() {
		
	}
	
	@Override
	public String battutaEroe() {
		return "Elune, dammi la forza!";
		
	}

	@Override
	public String getNome() {
		return "Tyrande Soffiabrezza";
	}

	@Override
	public String getSpecie() {
		return "elfica";
	}

	
	@Override
	public String toString() {
		return "Salve! Il mio nome è " + getNome() + ", specie " + getSpecie()  +
				". Appartengo alla classe " + getNomeClasse() + ", il mio potere eroe è " + 
				potereEroe() + ". " + battutaEroe();
	}

}
