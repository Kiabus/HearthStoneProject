package eroi;

public class ReRastakhan extends ClasseSciamano {

	public ReRastakhan(String nome, int puntiVita, String specie, String nomeClasse) {
		super(nome, puntiVita, specie, nomeClasse);
		// TODO Auto-generated constructor stub
	}
	
	public ReRastakhan() {

	}

	@Override
	public String battutaEroe() {
		return "Sei di fronte a Re Rastakhan";
		
	}

	@Override
	public String getNome() {

		return "Re Rastakhan";
	}

	@Override
	public String getSpecie() {

		return "troll";
	}
	
	@Override
	public String toString() {
		return "Salve! Il mio nome è " + getNome() + ", specie " + getSpecie()  +
				". Appartengo alla classe " + getNomeClasse() + ", il mio potere eroe è " + 
				potereEroe() + ". " + battutaEroe();
	}

}
