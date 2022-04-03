import java.awt.geom.*;

public class Rectangle{
	
	Point2D.Double origin;
	Point2D.Double corner;

	Rectangle(double x1, double y1, double x2, double y2){
	
		this.origin = new Point2D.Double(x1,y1);
		this.corner = new Point2D.Double(x2,y2);
	} 

	public double largeur(){
	
		return corner.getX() - origin.getX();
	}

	public double longueur(){
	
		return corner.getY() - origin.getY();
	}

	public double surface(){
	
		return this.largeur() * this.longueur();
	}

	public double perimetre(){

		return 2 * (this.longueur() + this.largeur());

	}

	public String toString(){
	
		return "(<"+ this.origin.toString() + "> , <" + this.corner.toString() + ">)";
	}


}
