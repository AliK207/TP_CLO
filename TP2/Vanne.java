/**
 *
 * @author Bernard.Carre@polytech-lille.fr
 */

public class Vanne extends Composant {
	
	protected Composant in;
	
	public void setIn(Composant comp) {
		
		in = comp;
		
	}

	public String description(){

		if(in == null)
			return super.getId() + " in not connected";
		
		return super.getId() + " in : " + in.getId();
	}
				
	
}
