package Exercice1;

public class main {

	public static void main(String[] args) {
		Hippopotame hippo1 = new Hippopotame("bertrand",500,2);
		hippo1.eat();
		hippo1.eat();
		hippo1.swim();
		hippo1.swim();
		hippo1.swim();
		System.out.println(hippo1.getInfos());
		Hippopotame hippo2 = new Hippopotame("gerard",600,1);
		hippo2.eat();
		hippo2.eat();
		hippo2.swim();
		hippo2.swim();
		hippo2.swim();
		
		System.out.println(hippo2.getInfos());
		hippo1.fight(hippo2);
		
		Hippopotame hippo3 = new Hippopotame("michel",2400,8);
		for(int i=1;i<=21;i++) {
			for(int j=1;j<=15;j++) {
				hippo3.eat();
				hippo3.eat();
				hippo3.swim();
				hippo3.swim();
				hippo3.swim();
			}
			System.out.println(hippo3.getInfos());
			System.out.println("fin de la journée "+i);
		}
	}

}
