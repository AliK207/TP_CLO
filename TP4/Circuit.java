import java.util.*;

public class Circuit {

	List<Composant> composants = new ArrayList<Composant>();
	String nom;

	public Circuit(String nom, Composant[] cps){
		
		this.nom = nom;
		composants.addAll(Arrays.asList(cps));
		Collections.sort(composants);
	}
	
	public List<String> nomenclature(){
	
		List<String> list_ids = new ArrayList<String>();

		for(Composant c : composants){
			list_ids.add(c.description());
		}

		return list_ids;
	}

	public void description(){
		
		System.out.printf("NOM : %s\n",this.nom);

		for(Composant c : composants){
			
			System.out.println(c.description());
		}
	}

	public void traceEtats() throws NonConnecteException{
		
		System.out.printf("NOM : %s\n",this.nom);
		
		for(Composant c : composants)
			System.out.println(c.traceEtat());
	}

	public List<Interrupteur> getIns(){
		
		List<Interrupteur> list_ins = new ArrayList<Interrupteur>();
		for(Composant c : composants){
			if(c instanceof Interrupteur)
				list_ins.add((Interrupteur)c);

		}
		return list_ins;
	}

	public List<Vanne> getOuts(){
	
		List<Vanne> lv = new ArrayList<Vanne>();
		for(Composant c:composants)
			if(c instanceof Vanne)
				lv.add((Vanne)c);
		return lv;
	}



}
		

