package Spital10Flyweight.clase;

public class SalonInternare {
	private int nrSalon;
	private int nrPat;
	private int nrZileSpitalizate;
	
	public SalonInternare(int nrSalon, int nrPat, int nrZileSpitalizate) {
		super();
		this.nrSalon = nrSalon;
		this.nrPat = nrPat;
		this.nrZileSpitalizate = nrZileSpitalizate;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Salon [nrSalon=");
		builder.append(nrSalon);
		builder.append(", nrPat=");
		builder.append(nrPat);
		builder.append(", nrZileSpitalizate=");
		builder.append(nrZileSpitalizate);
		builder.append("]");
		return builder.toString();
	}
}
