package eroi;

public class AlleriaVentolesto extends ClasseCacciatore {

	public AlleriaVentolesto(String nome, int puntiVita, String specie, String nomeClasse) {
		super(nome, puntiVita, specie, nomeClasse);
		// TODO Auto-generated constructor stub
	}
	
	public AlleriaVentolesto() {
		
	}

	@Override
	public String battutaEroe() {
		return "Trema davanti alla potenza degli elfi!";
		
	}

	@Override
	public String getNome() {
		return "Alleria Ventolesto";
	}

	@Override
	public String getSpecie() {
		return "elfica";
	}
	
	@Override
	public String toString() {
		return "Salve! Il mio nome è " + getNome() + ", specie " + getSpecie()  +
				". Appartengo alla classe " + getNomeClasse() + ", il mio potere eroe è " + 
				potereEroe() + ". " + battutaEroe();
	}

}
