package eroi;

public class DamaScorzabruna extends ClasseDruido {

	public DamaScorzabruna(String nome, int puntiVita, String specie, String nomeClasse) {
		super(nome, puntiVita, specie, nomeClasse);
		// TODO Auto-generated constructor stub
	}
	
	public DamaScorzabruna() {
		
	}

	@Override
	public String battutaEroe() {
		return "Sei qui per una lezione?";
		
	}

	@Override
	public String getNome() {
		
		return "Dama Scorzabruna";
	}

	@Override
	public String getSpecie() {
		
		return "albero";
	}
	
	@Override
	public String toString() {
		return "Salve! Il mio nome è " + getNome() + ", specie " + getSpecie()  +
				". Appartengo alla classe " + getNomeClasse() + ", il mio potere eroe è " + 
				potereEroe() + ". " + battutaEroe();
	}

}
