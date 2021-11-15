package Exercice3;


public class Circle {

	Point point;
	int radius;
	
	public Circle(Point point,int radius) {
		this.point=point;
		this.radius=radius;
	}
	
	public double area() {
		return (this.radius^2)*3.14;
	}
	
	public boolean containsPoint(Point point) {
		double temp = (point.x-this.point.x)^2 + (point.y-this.point.y)^2;
		double temp2=  this.radius^2;
		if(temp < temp2){
			return true;
		}
		else {
			return false;
		}
	}
	
	public String getInfos() {
		return "Mon point a comme coordonées " + this.point.x+","+this.point.y+ 
                " et mon rayon est de " + this.radius;
	}
	
}
