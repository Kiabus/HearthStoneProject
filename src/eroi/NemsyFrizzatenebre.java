package eroi;

public class NemsyFrizzatenebre extends ClasseStregone {

	public NemsyFrizzatenebre(String nome, int puntiVita, String specie, String nomeClasse) {
		super(nome, puntiVita, specie, nomeClasse);
		// TODO Auto-generated constructor stub
	}
	
	public NemsyFrizzatenebre() {

	}

	@Override
	public String battutaEroe() {
		return "Divertiamoci un po'!";
		
	}

	@Override
	public String getNome() {

		return "Nemsy Frizzatenebre";
	}

	@Override
	public String getSpecie() {

		return "gnomo";
	}
	
	@Override
	public String toString() {
		return "Salve! Il mio nome è " + getNome() + ", specie " + getSpecie()  +
				". Appartengo alla classe " + getNomeClasse() + ", il mio potere eroe è " + 
				potereEroe() + ". " + battutaEroe();
	}

}
