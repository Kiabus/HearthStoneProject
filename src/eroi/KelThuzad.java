package eroi;

public class KelThuzad extends ClasseMago {

	public KelThuzad(String nome, int puntiVita, String specie, String nomeClasse) {
		super(nome, puntiVita, specie, nomeClasse);
		
	}
	
	public KelThuzad() {
		
	}

	@Override
	public String battutaEroe() {
		return "La tua curiosità sarà la tua fine!";	
	}

	@Override
	public String getNome() {
		
		return "Kel'Thuzad";
	}

	@Override
	public String getSpecie() {
		
		return "non morto";
	}
	
	@Override
	public String toString() {
		return "Salve! Il mio nome è " + getNome() + ", specie " + getSpecie()  +
				". Appartengo alla classe " + getNomeClasse() + ", il mio potere eroe è " + 
				potereEroe() + ". " + battutaEroe();
	}

}
