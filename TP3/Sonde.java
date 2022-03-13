public class Sonde extends Composant {


	Composant cmp;
	String port;

	public Sonde(Composant c, String nom){
		this.cmp = c;
		this.port = nom;
	}

	
	public boolean getEtat(){
	
		System.out.print(port +" de " + this.cmp.getId() +" ,true or false ? ");
	       	return System.console().readLine() == "true";
		
	}




}
