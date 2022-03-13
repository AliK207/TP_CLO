import java.util.Scanner;

public class Sonde extends Composant {


	Composant cmp;
	String port;

	public Sonde(Composant c, String nom){
		this.cmp = c;
		this.port = nom;
	}

	
	public boolean getEtat(){
	
		boolean b;

		System.out.print(port +" de " + this.cmp.getId() +" ,true or false ? ");

		Scanner scan = new Scanner(System.in);
		b = scan.nextBoolean(); 
	
		return b;		
	}




}
