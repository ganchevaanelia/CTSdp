package CreditEuChain.clase;

public class Client {
	private String nume;
	private int varsta;
	private int salariu;

	public Client(String nume, int varsta, int salariu) {
		super();
		this.nume = nume;
		this.varsta = varsta;
		this.salariu = salariu;
	}

	public String getNume() {
		return nume;
	}

	public int getVarsta() {
		return varsta;
	}

	public int getSalariu() {
		return salariu;
	}
}
