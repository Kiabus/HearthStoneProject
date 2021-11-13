package eroi;

public class IllidanGrantempesta extends ClasseCacciatoreDemoni {

	public IllidanGrantempesta(String nome, int puntiVita, String specie, String nomeClasse) {
		super(nome, puntiVita, specie, nomeClasse);
		// TODO Auto-generated constructor stub
	}
	
	public IllidanGrantempesta() {
		
	}

	@Override
	public String battutaEroe() {
		return "Questo finisce adesso!";
		
	}

	@Override
	public String getNome() {
		
		return "Illidan Grantempesta";
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
