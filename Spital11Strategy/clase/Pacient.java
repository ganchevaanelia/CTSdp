package Spital11Strategy.clase;

public class Pacient {
	private IPlata tipPlata;
	String nume;
	
	public Pacient(String nume) {
		super();
		this.tipPlata = new PlataCash();
		this.nume = nume;
	}

	public void setTipPlata(IPlata tipPlata) {
		this.tipPlata = tipPlata;
	}

	public void plateste(float suma) {
		System.out.println("Clientul are de platit "+ suma);
		this.tipPlata.plateste(suma);
	}
}
