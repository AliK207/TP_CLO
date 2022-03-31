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


	static void traceEtats(Composant tab[]){
		
		
		for(int i = 0 ; i <tab.length ; i ++)

			try{
				System.out.printf("%s\n",tab[i].traceEtat());
			}
			catch(NonConnecteException exp){
				System.out.printf("NonConnecteException\n");
			}
	
	}
	
	static void test(Circuit circ){
		
		System.out.println(circ.nomenclature());
		circ.description();
		System.out.println(circ.getIns());
		System.out.println(circ.getOuts());

				
	}

	public static void main(String[] args){
		
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
		

		i1.on();
		i2.on();
		securite.off();

//		o1.setIn1(i1);
		o1.setIn1(new LazySonde(o1,"in1"));
		o1.setIn2(i2);

		n1.setIn(securite);

		a1.setIn1(o1);
		a1.setIn2(n1);

		v1.setIn(a1);

	

		//Affichage
		
		//descriptions(composants);
		//try{
		//	traceEtats(composants);
		//}
		//catch(NonConnecteException exp){
		//	System.out.printf("NonConnecteException\n");
		//}
	

		//TP 4 
		Circuit circ = new Circuit("MY FIRST CIRCUIT",composants);
	//	try{
			test(circ);
	//	}
	//	catch(NonConnecteException ex){
	//		System.out.println("Probleme\n");
//		}

		

		System.out.println("Au revoir!");
	}
}
