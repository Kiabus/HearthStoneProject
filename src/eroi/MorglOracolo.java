package eroi;

public class MorglOracolo extends ClasseSciamano {

	public MorglOracolo(String nome, int puntiVita, String specie, String nomeClasse) {
		super(nome, puntiVita, specie, nomeClasse);
		// TODO Auto-generated constructor stub
	}
	
	public MorglOracolo() {

	}

	@Override
	public String battutaEroe() {
		return "E' ora di una lezione, giovane!";
		
	}

	@Override
	public String getNome() {

		return "Morgl L'Oracolo";
	}

	@Override
	public String getSpecie() {

		return "murloc";
	}
	
	@Override
	public String toString() {
		return "Salve! Il mio nome è " + getNome() + ", specie " + getSpecie()  +
				". Appartengo alla classe " + getNomeClasse() + ", il mio potere eroe è " + 
				potereEroe() + ". " + battutaEroe();
	}

	
}
