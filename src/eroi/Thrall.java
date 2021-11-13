package eroi;

public class Thrall extends ClasseSciamano {

	public Thrall(String nome, int puntiVita, String specie, String nomeClasse) {
		super(nome, puntiVita, specie, nomeClasse);
		// TODO Auto-generated constructor stub
	}
	
	public Thrall() {

	}

	@Override
	public String battutaEroe() {
		return "Per Martelfato!";
		
	}

	@Override
	public String getNome() {

		return "Thrall Go'el";
	}

	@Override
	public String getSpecie() {

		return "orco";
	}
	
	@Override
	public String toString() {
		return "Salve! Il mio nome è " + getNome() + ", specie " + getSpecie()  +
				". Appartengo alla classe " + getNomeClasse() + ", il mio potere eroe è " + 
				potereEroe() + ". " + battutaEroe();
	}

}
