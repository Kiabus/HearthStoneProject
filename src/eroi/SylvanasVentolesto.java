package eroi;

public class SylvanasVentolesto extends ClasseCacciatore {

	public SylvanasVentolesto(String nome, int puntiVita, String specie, String nomeClasse) {
		super(nome, puntiVita, specie, nomeClasse);
		// TODO Auto-generated constructor stub
	}
	
	public SylvanasVentolesto() {

	}

	@Override
	public String battutaEroe() {
		return "Vittoria per i Rinnegati!";
		
	}

	@Override
	public String getNome() {

		return "Sylvanas Ventolesto";
	}

	@Override
	public String getSpecie() {
		
		return "banshee";
	}
	
	@Override
	public String toString() {
		return "Salve! Il mio nome è " + getNome() + ", specie " + getSpecie()  +
				". Appartengo alla classe " + getNomeClasse() + ", il mio potere eroe è " + 
				potereEroe() + ". " + battutaEroe();
	}

}
