package Spital1Builder.clase;

public class PacientBuilder implements AbstractBuilder {
	private Pacient internare;

	public PacientBuilder() {
		this.internare = new Pacient(0, false, false, false, false);
	}

	public PacientBuilder setCodInternare(int codInternare) {
		internare.setCodInternare(codInternare);
		return this;
	}

	public PacientBuilder setArePatRabatabil(boolean arePatRabatabil) {
		internare.setArePatRabatabil(arePatRabatabil);
		return this;
	}

	public PacientBuilder setAreMicDejun(boolean areMicDejun) {
		internare.setAreMicDejun(areMicDejun);
		return this;
	}

	public PacientBuilder setArePapuci(boolean arePapuci) {
		internare.setArePapuci(arePapuci);
		return this;
	}

	public PacientBuilder setAreHalat(boolean areHalat) {
		internare.setAreHalat(areHalat);
		return this;
	}

	@Override
	public Pacient build() {
		return internare;
	}

}
