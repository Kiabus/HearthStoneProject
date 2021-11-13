package eroi;

public class ValeeraSanguinar extends ClasseLadro {

	public ValeeraSanguinar(String nome, int puntiVita, String specie, String nomeClasse) {
		super(nome, puntiVita, specie, nomeClasse);
		// TODO Auto-generated constructor stub
	}
	
	public ValeeraSanguinar() {

	}

	@Override
	public String battutaEroe() {
		return "Guardati le spalle";
		
	}

	@Override
	public String getNome() {

		return "Valeera Sanguinar";
	}

	@Override
	public String getSpecie() {

		return "elfo sanguinario";
	}
	
	@Override
	public String toString() {
		return "Salve! Il mio nome è " + getNome() + ", specie " + getSpecie()  +
				". Appartengo alla classe " + getNomeClasse() + ", il mio potere eroe è " + 
				potereEroe() + ". " + battutaEroe();
	}

}
