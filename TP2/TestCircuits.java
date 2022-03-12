/**
 *
 * @author Bernard.Carre@polytech-lille.fr
 */

public class TestCircuits {

	static void printId(Composant tab[]){
	
		for(int i = 0 ; i < tab.length ; i++){
		
			System.out.print(tab[i].getId());
		}
	}

	static void descriptions(Composant tab[]){
	
		for(int i = 0; i < tab.length ; i++)
			System.out.printf("%s\n",tab[i].description());
	}

	public static void main(String[] args) {
		//Construction
		
		Composant[] composants = new Composant[7];
		
		Or o1 = new Or();
	       	composants[0] = o1;

		And a1 = new And();
		composants[1] = a1;

		Not n1 = new Not();
		composants[2] = n1;

		Interrupteur i1 = new Interrupteur();
		composants[3] = i1;

		Interrupteur i2 = new Interrupteur();
		composants[4] = i2;

		Interrupteur securite = new Interrupteur();
		composants[5] = securite;

		Vanne v1 = new Vanne();
		composants[6] = v1;


		
		//Connexions

		o1.setIn1(i1);
		o1.setIn2(i2);

		n1.setIn(securite);

		a1.setIn1(o1);
		a1.setIn2(n1);

		v1.setIn(a1);

		
		//Affichage

//		printId(composants);	
		descriptions(composants);
		System.out.println("Au revoir!");
	}
}
