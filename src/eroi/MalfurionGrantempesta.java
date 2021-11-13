package eroi;

public class MalfurionGrantempesta extends ClasseDruido {

	public MalfurionGrantempesta(String nome, int puntiVita, String specie, String nomeClasse) {
		super(nome, puntiVita, specie, nomeClasse);
		// TODO Auto-generated constructor stub
	}
	
	public MalfurionGrantempesta() {

	}

	@Override
	public String battutaEroe() {
		return "Devo proteggere la natura";
		
	}

	@Override
	public String getNome() {

		return "Malfurion Grantempesta";
	}

	@Override
	public String getSpecie() {

		return "elfo della notte";
	}
	
	@Override
	public String toString() {
		return "Salve! Il mio nome è " + getNome() + ", specie " + getSpecie()  +
				". Appartengo alla classe " + getNomeClasse() + ", il mio potere eroe è " + 
				potereEroe() + ". " + battutaEroe();
	}

}
