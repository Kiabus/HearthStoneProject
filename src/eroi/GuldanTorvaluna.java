package eroi;

public class GuldanTorvaluna extends ClasseStregone {

	public GuldanTorvaluna(String nome, int puntiVita, String specie, String nomeClasse) {
		super(nome, puntiVita, specie, nomeClasse);
		// TODO Auto-generated constructor stub
	}
	
	public GuldanTorvaluna() {
		
	}

	@Override
	public String battutaEroe() {
		return "La tua anima sar� mia!";
		
	}

	@Override
	public String getNome() {
		
		return "Gul'dan Torvaluna";
	}

	@Override
	public String getSpecie() {
		
		return "orco";
	}
	
	@Override
	public String toString() {
		return "Salve! Il mio nome � " + getNome() + ", specie " + getSpecie()  +
				". Appartengo alla classe " + getNomeClasse() + ", il mio potere eroe � " + 
				potereEroe() + ". " + battutaEroe();
	}

}
