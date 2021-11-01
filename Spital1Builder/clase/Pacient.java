package Spital1Builder.clase;

public class Pacient {
	private int codInternare;
	private boolean arePatRabatabil;
	private boolean areMicDejun;
	private boolean arePapuci;
	private boolean areHalat;

	public Pacient(int codInternare, boolean arePatRabatabil, boolean areMicDejun, boolean arePapuci,
			boolean areHalat) {
		super();
		this.codInternare = codInternare;
		this.arePatRabatabil = arePatRabatabil;
		this.areMicDejun = areMicDejun;
		this.arePapuci = arePapuci;
		this.areHalat = areHalat;
	}

	protected int getCodInternare() {
		return codInternare;
	}

	protected void setCodInternare(int codInternare) {
		this.codInternare = codInternare;
	}

	protected boolean isArePatRabatabil() {
		return arePatRabatabil;
	}

	protected void setArePatRabatabil(boolean arePatRabatabil) {
		this.arePatRabatabil = arePatRabatabil;
	}

	protected boolean isAreMicDejun() {
		return areMicDejun;
	}

	protected void setAreMicDejun(boolean areMicDejun) {
		this.areMicDejun = areMicDejun;
	}

	protected boolean isArePapuci() {
		return arePapuci;
	}

	protected void setArePapuci(boolean arePapuci) {
		this.arePapuci = arePapuci;
	}

	protected boolean isAreHalat() {
		return areHalat;
	}

	protected void setAreHalat(boolean areHalat) {
		this.areHalat = areHalat;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Internare [codInternare=");
		builder.append(codInternare);
		builder.append(", arePatRabatabil=");
		builder.append(arePatRabatabil);
		builder.append(", areMicDejun=");
		builder.append(areMicDejun);
		builder.append(", arePapuci=");
		builder.append(arePapuci);
		builder.append(", areHalat=");
		builder.append(areHalat);
		builder.append("]");
		return builder.toString();
	}
}
