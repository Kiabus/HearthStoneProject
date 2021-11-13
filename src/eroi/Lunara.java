package eroi;

public class Lunara extends ClasseDruido {

	public Lunara(String nome, int puntiVita, String specie, String nomeClasse) {
		super(nome, puntiVita, specie, nomeClasse);
		// TODO Auto-generated constructor stub
	}
	
	public Lunara() {
		
	}

	@Override
	public String battutaEroe() {
		return "La foresta reagisce";
		
	}

	@Override
	public String getNome() {

		return "Lunara Cenarius";
	}

	@Override
	public String getSpecie() {

		return "driade";
	}
	
	@Override
	public String toString() {
		return "Salve! Il mio nome è " + getNome() + ", specie " + getSpecie()  +
				". Appartengo alla classe " + getNomeClasse() + ", il mio potere eroe è " + 
				potereEroe() + ". " + battutaEroe();
	}

}
