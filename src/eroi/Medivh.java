package eroi;

public class Medivh extends ClasseMago {

	public Medivh(String nome, int puntiVita, String specie, String nomeClasse) {
		super(nome, puntiVita, specie, nomeClasse);
	}
	
	public Medivh() {

	}

	@Override
	public String battutaEroe() {
		return "Date inizio alle danze!";	
	}

	@Override
	public String getNome() {

		return "Medivh Warlock";
	}

	@Override
	public String getSpecie() {
		
		return "umana";
	}
	
	@Override
	public String toString() {
		return "Salve! Il mio nome � " + getNome() + ", specie " + getSpecie()  +
				". Appartengo alla classe " + getNomeClasse() + ", il mio potere eroe � " + 
				potereEroe() + ". " + battutaEroe();
	}

}
