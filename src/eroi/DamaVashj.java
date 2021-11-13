package eroi;

public class DamaVashj extends ClasseSciamano {

	public DamaVashj(String nome, int puntiVita, String specie, String nomeClasse) {
		super(nome, puntiVita, specie, nomeClasse);
		// TODO Auto-generated constructor stub
	}
	
	public DamaVashj() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String battutaEroe() {
		return "Il tuo tempo finisce qui!";
		
	}

	@Override
	public String getNome() {
		
		return "Dama Vashj";
	}

	@Override
	public String getSpecie() {
		
		return "naga";
	}
	
	@Override
	public String toString() {
		return "Salve! Il mio nome è " + getNome() + ", specie " + getSpecie()  +
				". Appartengo alla classe " + getNomeClasse() + ", il mio potere eroe è " + 
				potereEroe() + ". " + battutaEroe();
	}

}
