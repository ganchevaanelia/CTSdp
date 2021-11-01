package LocuintaStrategy.clase;

public class Locuinta {
	private int codLocuinta;
	private float pretMP;
	private int nrCamere;
	
	public Locuinta(int codLocuinta, float pretMP, int nrCamere) {
		super();
		this.codLocuinta = codLocuinta;
		this.pretMP = pretMP;
		this.nrCamere = nrCamere;
	}

	public int getCodLocuinta() {
		return codLocuinta;
	}

	public float getPretMP() {
		return pretMP;
	}

	public int getNrCamere() {
		return nrCamere;
	}
}
