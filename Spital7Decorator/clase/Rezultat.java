package Spital7Decorator.clase;

public class Rezultat implements IRezultat{
	public String rezultat;

	public Rezultat(String rezultat) {
		this.rezultat = rezultat;
	}

	@Override
	public void printeazaRezultat() {
		System.out.println("S-a printat rezultatul " + rezultat);
		
	}
	
	
}
