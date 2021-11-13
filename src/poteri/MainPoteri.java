package poteri;

public class MainPoteri {

	public static void main(String[] args) {
		
		//TiroStabilizzato
		TiroStabilizzato tiroStab = new TiroStabilizzato();
		System.out.println(tiroStab.toString());
		
		//ArtigliDemoniaci
		ArtigliDemoniaci artigliDemo = new ArtigliDemoniaci();
		System.out.println(artigliDemo.toString());
		
		//Mutaforma
		Mutaforma muta = new Mutaforma();
		System.out.println(muta.toString());
		
		//DetonazioneFuoco
		DetonazioneFuoco detFuoco = new DetonazioneFuoco();
		System.out.println(detFuoco.toString());
		
		//Rinforzo
		Rinforzo rinforzo = new Rinforzo();
		System.out.println(rinforzo.toString());
		
		//CuraInferiore
		CuraInferiore cura = new CuraInferiore();
		System.out.println(cura.toString());
		
		//MaestriaPugnali
		MaestriaPugnali maestria = new MaestriaPugnali();
		System.out.println(maestria.toString());
		
		//EvocazioneTotemica
		EvocazioneTotemica evocaTotem = new EvocazioneTotemica();
		System.out.println(evocaTotem.toString());
		
		//ConversioneVitale
		ConversioneVitale convVitale = new ConversioneVitale();
		System.out.println(convVitale.toString());
		
		//PotenziamentoArmatura
		PotenziamentoArmatura armatura = new PotenziamentoArmatura();
		System.out.println(armatura.toString());

	}

}
