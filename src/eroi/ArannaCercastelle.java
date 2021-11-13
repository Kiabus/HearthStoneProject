package eroi;

public class ArannaCercastelle extends ClasseCacciatoreDemoni {

	public ArannaCercastelle(String nome, int puntiVita, String specie, String nomeClasse) {
		super(nome, puntiVita, specie, nomeClasse);
		// TODO Auto-generated constructor stub
	}
	
	public ArannaCercastelle() {
		
	}
	
	@Override
	public String battutaEroe() {
		return "Sono determinata a vincere!";
		
	}

	@Override
	public String getNome() {
		return "Aranna Cercastelle";
	}

	@Override
	public String getSpecie() {
		return "demone/elfo della notte";
	}
	
	@Override
	public String toString() {
		return "Salve! Il mio nome è " + getNome() + ", specie " + getSpecie()  +
				". Appartengo alla classe " + getNomeClasse() + ", il mio potere eroe è " + 
				potereEroe() + ". " + battutaEroe();
	}

}
