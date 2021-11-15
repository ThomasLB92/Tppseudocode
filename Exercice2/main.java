package Exercice2;

public class main {

	public static void main(String[] args) {
		Point point1 = new Point(1,2);
		Point point2 = new Point(3,5);
		System.out.println(point1.getX());
		System.out.println(point1.getY());
		System.out.println(point2.getX());
		System.out.println(point2.getY());
		point1.setX(4);
		point1.setY(6);
		point2.setX(7);
		point2.setY(2);
		point1.getInfos();
		point2.getInfos();
	}

}
