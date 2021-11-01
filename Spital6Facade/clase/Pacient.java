package Spital6Facade.clase;

public class Pacient {

	private String nume;
	private String stare;
	
	public Pacient(String nume, String stare) {
		this.nume = nume;
		this.stare = stare;
	}

	protected String getNume() {
		return nume;
	}

	protected String getStare() {
		return stare;
	}
}
