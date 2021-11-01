package Spital10Flyweight.clase;

public class Pacient implements Flyweight{
	private String nume;
	private String nrTel;
	private String adresa;
	
	public Pacient(String nume, String nrTel, String adresa) {
		super();
		this.nume = nume;
		this.nrTel = nrTel;
		this.adresa = adresa;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pacient [nume=");
		builder.append(nume);
		builder.append(", nrTel=");
		builder.append(nrTel);
		builder.append(", adresa=");
		builder.append(adresa);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public void printeazaInternari(SalonInternare salon) {
		System.out.println(this.toString()+ " " + salon.toString());
		
	}
}

