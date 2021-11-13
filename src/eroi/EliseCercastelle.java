package eroi;

public class EliseCercastelle extends ClasseDruido {

	public EliseCercastelle(String nome, int puntiVita, String specie, String nomeClasse) {
		super(nome, puntiVita, specie, nomeClasse);
		// TODO Auto-generated constructor stub
	}
	
	public EliseCercastelle() {
		
	}

	@Override
	public String battutaEroe() {
		return "La lezione è iniziata!";
		
	}

	@Override
	public String getNome() {
		
		return "Elise Cercastelle";
	}

	@Override
	public String getSpecie() {
		
		return "elfo della notte";
	}
	
	@Override
	public String toString() {
		return "Salve! Il mio nome è " + getNome() + ", specie " + getSpecie()  +
				". Appartengo alla classe " + getNomeClasse() + ", il mio potere eroe è " + 
				potereEroe() + ". " + battutaEroe();
	}

}
