package eroi;

public class MaievCantombroso extends ClasseLadro {

	public MaievCantombroso(String nome, int puntiVita, String specie, String nomeClasse) {
		super(nome, puntiVita, specie, nomeClasse);
		// TODO Auto-generated constructor stub
	}
	
	public MaievCantombroso() {

	}

	@Override
	public String battutaEroe() {
		return "Nessuno pu� fuggire alla mia furia";
		
	}

	@Override
	public String getNome() {

		return "Maiev Cantombroso";
	}

	@Override
	public String getSpecie() {

		return "elfo della notte";
	}
	
	@Override
	public String toString() {
		return "Salve! Il mio nome � " + getNome() + ", specie " + getSpecie()  +
				". Appartengo alla classe " + getNomeClasse() + ", il mio potere eroe � " + 
				potereEroe() + ". " + battutaEroe();
	}

}
