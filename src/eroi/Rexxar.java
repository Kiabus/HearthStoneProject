package eroi;

public class Rexxar extends ClasseCacciatore {

	public Rexxar(String nome, int puntiVita, String specie, String nomeClasse) {
		super(nome, puntiVita, specie, nomeClasse);
		// TODO Auto-generated constructor stub
	}
	
	public Rexxar() {

	}

	@Override
	public String battutaEroe() {
		return "Che la caccia abbia inizio!";
		
	}

	@Override
	public String getNome() {

		return "Rexxar Moc'Nathal";
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
