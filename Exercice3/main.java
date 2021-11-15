package Exercice3;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point point1= new Point(1,3);
		Point point2= new Point(2,5);
		Circle cercle1= new Circle(point1,5);
		Circle cercle2= new Circle(point2,4);
		System.out.println(cercle1.area());
		System.out.println(cercle2.area());
		System.out.println(cercle1.containsPoint(point1));
		System.out.println(cercle1.containsPoint(point2));
		System.out.println(cercle2.containsPoint(point1));
		System.out.println(cercle2.containsPoint(point2));
		System.out.println(cercle1.getInfos());
	}

}
