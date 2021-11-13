package eroi;

public class DamaLiadrin extends ClassePaladino {

	public DamaLiadrin(String nome, int puntiVita, String specie, String nomeClasse) {
		super(nome, puntiVita, specie, nomeClasse);
		// TODO Auto-generated constructor stub
	}
	
	public DamaLiadrin() {
		
	}

	@Override
	public String battutaEroe() {
		return "La mia lama brucia di fuoco sacro!";
		
	}

	@Override
	public String getNome() {
		
		return "Dama Liadrin";
	}

	@Override
	public String getSpecie() {
		
		return "elfo sanguinario";
	}
	
	@Override
	public String toString() {
		return "Salve! Il mio nome è " + getNome() + ", specie " + getSpecie()  +
				". Appartengo alla classe " + getNomeClasse() + ", il mio potere eroe è " + 
				potereEroe() + ". " + battutaEroe();
	}

}
