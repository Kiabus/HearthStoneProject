package eroi;

public class AnduinWrynn extends ClasseSacerdote {

	public AnduinWrynn(String nome, int puntiVita, String specie, String nomeClasse) {
		super(nome, puntiVita, specie, nomeClasse);
		
	}
	
	public AnduinWrynn() {
		
	}

	@Override
	public String battutaEroe() {
		return "La Luce porter� alla vittoria!";
		
	}

	@Override
	public String getNome() {
		return "Anduin Wrynn";
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
