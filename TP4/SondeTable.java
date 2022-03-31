import java.util.*;

public class SondeTable {
	
	//instances
	Map<LazySonde,Interrupteur> sondesToInterrupteurs = new HashMap<LazySonde,Interrupteur>();
	Map<Interrupteur,LazySonde> interrupteursToSondes = new HashMap<Interrupteur,LazySonde>();


	Interrupteur getInterrupteur(LazySonde sonde){
	
		return this.sondesToInterrupteurs.get(sonde);
	}

	LazySonde getSonde(Interrupteur interr, Composant cible, String entree){
	
		if(this.interrupteursToSondes.get(interr) == null){
		
			LazySonde sonde = new LazySonde(cible,entree);
			this.interrupteursToSondes.put(interr,sonde);
			this.sondesToInterrupteurs.put(sonde,interr);
			return sonde;
		}
		else{
		
			return this.interrupteursToSondes.get(interr);
		}
	}

	void resetSondes(){
		
		for(LazySonde ls : sondesToInterrupteurs.keySet())
			ls.reset();
	}

	void clear(){
	
		this.sondesToInterrupteurs.clear();
		this.interrupteursToSondes.clear();
	}
}
	

