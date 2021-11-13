package eroi;

public class MagniBarbabronzea extends ClasseGuerriero {

	public MagniBarbabronzea(String nome, int puntiVita, String specie, String nomeClasse) {
		super(nome, puntiVita, specie, nomeClasse);
		// TODO Auto-generated constructor stub
	}
	
	public MagniBarbabronzea() {

	}

	@Override
	public String battutaEroe() {
		return "Per Khaz Modan!";
		
	}

	@Override
	public String getNome() {

		return "Magni Barbabronzea";
	}

	@Override
	public String getSpecie() {

		return "nano di montagna";
	}
	
	@Override
	public String toString() {
		return "Salve! Il mio nome è " + getNome() + ", specie " + getSpecie()  +
				". Appartengo alla classe " + getNomeClasse() + ", il mio potere eroe è " + 
				potereEroe() + ". " + battutaEroe();
	}

}
