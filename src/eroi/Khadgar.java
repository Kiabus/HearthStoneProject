package eroi;

public class Khadgar extends ClasseMago {

	public Khadgar(String nome, int puntiVita, String specie, String nomeClasse) {
		super(nome, puntiVita, specie, nomeClasse);
		
	}
	
	public Khadgar() {
		
	}

	@Override
	public String battutaEroe() {
		return "La conoscenza � potere";
		
	}

	@Override
	public String getNome() {
		
		return "Lord Khadgar";
	}

	@Override
	public String getSpecie() {

		return "umana";
	}
	
	@Override
	public String toString() {
		return "Salve! Il mio nome � " + getNome() + ", specie " + getSpecie()  +
				". Appartengo alla classe " + getNomeClasse() + ", il mio potere eroe � " + 
				potereEroe() + ". " + battutaEroe();
	}

}
