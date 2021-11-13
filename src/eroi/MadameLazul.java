package eroi;

public class MadameLazul extends ClasseSacerdote {

	public MadameLazul(String nome, int puntiVita, String specie, String nomeClasse) {
		super(nome, puntiVita, specie, nomeClasse);
		
	}
	
	public MadameLazul() {

	}

	@Override
	public String battutaEroe() {
		return "Ho previsto questo incontro";
		
	}

	@Override
	public String getNome() {
		return "Madame Lazul";
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
