package Spital1Builder.clase;

public class PacientBuilderBuild implements AbstractBuilder {
	private int codInternare;
	private boolean arePatRabatabil;
	private boolean areMicDejun;
	private boolean arePapuci;
	private boolean areHalat;

	public PacientBuilderBuild() {
		super();
		this.codInternare = 100;
		this.arePatRabatabil = false;
		this.areMicDejun = false;
		this.arePapuci = false;
		this.areHalat = false;
	}

	public PacientBuilderBuild setCodInternare(int codInternare) {
		this.codInternare = codInternare;
		return this;
	}

	public PacientBuilderBuild setArePatRabatabil(boolean arePatRabatabil) {
		this.arePatRabatabil = arePatRabatabil;
		return this;
	}

	public PacientBuilderBuild setAreMicDejun(boolean areMicDejun) {
		this.areMicDejun = areMicDejun;
		return this;
	}

	public PacientBuilderBuild setArePapuci(boolean arePapuci) {
		this.arePapuci = arePapuci;
		return this;
	}

	public PacientBuilderBuild setAreHalat(boolean areHalat) {
		this.areHalat = areHalat;
		return this;
	}

	@Override
	public Pacient build() {
		return new Pacient(codInternare, arePatRabatabil, areMicDejun, arePapuci, areHalat);
	}
}
