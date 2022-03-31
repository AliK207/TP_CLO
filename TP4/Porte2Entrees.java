public abstract class Porte2Entrees extends Porte{

	Composant in1;
	Composant in2;

	void setIn1(Composant comp){
		this.in1 = comp;
	}

	void setIn2(Composant comp){
		this.in2 = comp;
	}

	public String description(){
	
		if(in1 != null && in2 != null)
			return super.getId() + " in1 : " + in1.getId() + " in2 : " + in2.getId();
		if(in1 == null && in2 != null)
			return super.getId() + " in1 : not connected  in2 : " + in2.getId();
		if(in1 != null && in2 == null)
			return super.getId() + " in1 : " + in1.getId() + " in2 : not connected";

		return super.getId() + " in1  & in2 not connected";

	}

	public boolean getEtat() throws NonConnecteException{
	
		if(in1 == null || in2 == null)
			throw new NonConnecteException();
		else
			return eval();
	
	}
	public abstract boolean eval() throws NonConnecteException;


}

