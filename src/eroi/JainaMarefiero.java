package eroi;

public class JainaMarefiero extends ClasseMago {

	public JainaMarefiero(String nome, int puntiVita, String specie, String nomeClasse) {
		super(nome, puntiVita, specie, nomeClasse);
		
	}
	
	public JainaMarefiero() {
			
	}


	@Override
	public String battutaEroe() {
		return "L'hai voluto tu!";	
	}


	@Override
	public String getNome() {
		
		return "Jaina Marefiero";
	}


	@Override
	public String getSpecie() {
		
		return "umana";
	}
	
	@Override
	public String toString() {
		return "Salve! Il mio nome è " + getNome() + ", specie " + getSpecie()  +
				". Appartengo alla classe " + getNomeClasse() + ", il mio potere eroe è " + 
				potereEroe() + ". " + battutaEroe();
	}

}

