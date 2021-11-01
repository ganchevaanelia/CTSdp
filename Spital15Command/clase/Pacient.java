package Spital15Command.clase;

public class Pacient {
	private String nume;
	private boolean esteInternat;
	private boolean esteTratatImd;
	
	public Pacient(String nume) {
		super();
		this.nume = nume;
		this.esteInternat = false;
		this.esteTratatImd = false;
	}
	
	public void mergeLaInternare () {
		if (!this.esteInternat) {
			System.out.println("Poate fi internat");
			this.esteInternat=true;
		}
		else {
			System.out.println("Nu poate fi internat");
		}
	}
	
	public void mergeLaTratare() {
		if (!this.esteTratatImd) {
			System.out.println("Poate fi tratat imediat");
			this.esteTratatImd=true;
		}
		else {
			System.out.println("Nu poate fi tratat imediat");
		}
	}
}
