package Spital13State.clase;

public class Pacient {
	private String nume;
	private Stare stare;
	
	public Pacient(String nume) {
		super();
		this.nume = nume;
		this.stare = new Internat();
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public Stare getStare() {
		return stare;
	}

	public void setStare(Stare stare) {
		this.stare = stare;
	}
	
	public void observaPacient() {
		SubObservatie subObservatie = new SubObservatie();
		subObservatie.modificaStare(this);
	}
	
	public void externeazaPacient() {
		Externat externat = new Externat();
		externat.modificaStare(this);
	}
}
