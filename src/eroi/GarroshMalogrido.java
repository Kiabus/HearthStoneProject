package eroi;

public class GarroshMalogrido extends ClasseGuerriero {

	public GarroshMalogrido(String nome, int puntiVita, String specie, String nomeClasse) {
		super(nome, puntiVita, specie, nomeClasse);
		// TODO Auto-generated constructor stub
	}
	
	public GarroshMalogrido() {
		
	}

	@Override
	public String battutaEroe() {
		return "Vittoria o morte!";
		
	}

	@Override
	public String getNome() {
		
		return "Garrosh Malogrido";
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
