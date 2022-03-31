public class And extends Porte2Entrees{
	


	/*public boolean getEtat() throws NonConnecteException {
	
		if(in1 == null || in2 == null)
			throw new NonConnecteException();
		else
			return (in1.getEtat() && in1.getEtat());

	}*/

	public boolean eval() throws NonConnecteException{
		return in1.getEtat() && in2.getEtat();
	}
}
