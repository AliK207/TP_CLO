/**
 *
 * @author Bernard.Carre@polytech-lille.fr
 */

public class Not extends Porte {
	
	protected Composant in;
	
	public void setIn(Composant comp) {
		
		in = comp;
		
	}

	public String description(){

		if(in == null) 
			return super.getId() + " in not connected ";

		return super.getId() + " in : " + in.getId();
	}

	public boolean getEtat() throws NonConnecteException {

		if (in == null) {

			throw new NonConnecteException();

		} else {

			return !in.getEtat();

		}

}
	
}
