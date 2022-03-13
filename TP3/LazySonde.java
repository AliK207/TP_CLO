public class LazySonde extends Sonde {

	boolean  flag, b;

	Composant cmp;
	String port;

	public LazySonde(Composant cmp, String port){
	
		super(cmp,port);	
	}

	public boolean getEtat(){
	
		if(flag == false){

			flag = true;
			b = super.getEtat();
			return b;
		}
	
		return b;
	}

	void reset(){

		flag = false;
		this.getEtat();
	}
	

}
