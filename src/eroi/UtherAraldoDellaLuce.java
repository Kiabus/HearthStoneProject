package eroi;

public class UtherAraldoDellaLuce extends ClassePaladino {

	public UtherAraldoDellaLuce(String nome, int puntiVita, String specie, String nomeClasse) {
		super(nome, puntiVita, specie, nomeClasse);
		// TODO Auto-generated constructor stub
	}
	
	public UtherAraldoDellaLuce() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String getNome() {
		return "Uther, l'Araldo della Luce";
	}

	@Override
	public String getSpecie() {
		return "umana";
	}

	@Override
	public String battutaEroe() {
		return "Combatter� con onore!";	
	}
	
	@Override
	public String toString() {
		return "Salve! Il mio nome � " + getNome() + ", specie " + getSpecie()  +
				". Appartengo alla classe " + getNomeClasse() + ", il mio potere eroe � " + 
				potereEroe() + ". " + battutaEroe();
	}
}
