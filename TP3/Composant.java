/**
 *
 * @author Bernard.Carre@polytech-lille.fr
 */

public abstract class Composant {
	
	public String getId() {
		
		return super.toString(); // class@numero renvoye par Object
		
	}

	public String description(){
		return this.getId();
	}	
	
	public abstract boolean getEtat() throws NonConnecteException;	
	
	public String traceEtat() throws NonConnecteException{
	
		return this.description() +"  "+this.getEtat();

	
	}

}
