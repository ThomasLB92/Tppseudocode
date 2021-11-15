package Exercice1;

public class Hippopotame {
public String nom;
public int poids;
public int tailleDefenses;

	public Hippopotame(String nom, int poids, int tailleDefenses) {
		this.nom = nom;
		this.poids = poids;
		this.tailleDefenses=tailleDefenses;
	}
	
	public String getNom() {
		return this.nom;
		
	}
	
	public int getPoids() {
		return this.poids;
		
	}
	
	
	public int getTailleDefenses() {
		return this.tailleDefenses;
		
	}
	
	public void swim() {
		this.poids -= 300;
	}
	
	public void eat() {
		this.poids += 1000;
	}
	
	public Hippopotame fight(Hippopotame challenger) {
		if(this.tailleDefenses>challenger.getTailleDefenses()) {
			System.out.println("Votre hippopotame a gagné");
			return this;
		}
		else {
			System.out.println("Votre hippopotame a perdu");
			return challenger;
		}
	}
	
	public String getInfos() {
		return "Je m'appelle "+this.nom+" je pèse "+this.poids+" et mes défenses font "+this.tailleDefenses;
	}
}
