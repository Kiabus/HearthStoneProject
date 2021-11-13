package eroi;

public class ArthasMenethil extends ClassePaladino {

	public ArthasMenethil(String nome, int puntiVita, String specie, String nomeClasse) {
		super(nome, puntiVita, specie, nomeClasse);
		// TODO Auto-generated constructor stub
	}
	
	public ArthasMenethil() {

	}

	@Override
	public String battutaEroe() {
		return "Per Lordaeron!";
		
	}

	@Override
	public String getNome() {

		return "Arthas Menethil";
	}

	@Override
	public String getSpecie() {

		return "umana";
	}
	
	@Override
	public String toString() {
		return "Salve! Il mio nome è " + getNome() + ", specie " + getSpecie()  +
				". Appartengo alla classe " + getNomeClasse() + ", il mio potere eroe è " + 
				potereEroe() + ". " + battutaEroe();
	}

}
