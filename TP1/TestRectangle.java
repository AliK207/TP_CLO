import java.util.*;

public class TestRectangle{


	public static Rectangle creerRectangle(){
	
		Scanner scan = new Scanner(System.in);
		double x1,x2,y1,y2;

		System.out.printf("X1 = ");
	        x1 = scan.nextDouble();
		
		System.out.printf("Y1 = ");
	        y1 = scan.nextDouble();

		System.out.printf("X2 = ");
	        x2 = scan.nextDouble();

		System.out.printf("Y2 = ");
	        y2 = scan.nextDouble();

		return new Rectangle(x1,y1,x2,y2);


	}

	public static Rectangle max(Rectangle[] t){
	
		double maxi = 0;
		int index = 0;

		for(int i = 0; i <t.length ; i++){
		
			if(t[i].surface() >= maxi){
				index = i;
				maxi = t[i].surface();
			}
		}
		System.out.printf("max Rec is at i=%d\n",index); 
		System.out.println(t[index].toString());
		return t[index];
	}

	public static void main(String[] args){
		
	//	Rectangle r ;
	//	r = creerRectangle();
		
		int size;
		Scanner scan = new Scanner(System.in);

		size = scan.nextInt();

		Rectangle[] tabR = new Rectangle[Integer.parseInt(args[0])];

		for(int i = 0; i < Integer.parseInt(args[0]) ; i++){

			System.out.println("rectangle num "+i);
			tabR[i] = creerRectangle();
			System.out.println("Largeur = "+tabR[i].largeur());
			System.out.println("Longueur = "+tabR[i].longueur());
			System.out.println("Surface = "+tabR[i].surface());
			System.out.println("Perimetre ="+tabR[i].perimetre());
			

			System.out.println(tabR[i].toString());
		}

		System.out.printf("Max test method \n");
		max(tabR);


/*		System.out.println("Largeur = "+r.largeur());
		System.out.println("Longueur = "+r.longueur());
		System.out.println("Surface = "+r.surface());
		System.out.println("Perimetre ="+r.perimetre());

	*/
	}

}
