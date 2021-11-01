package Spital2Factory.clase;
//def interfata unui generator
public abstract class PersonalSpital {
	private String nume;

	public PersonalSpital(String nume) {
		this.nume=nume;
	}

	protected String getNume() {
		return nume;
	}

	protected void setNume(String nume) {
		this.nume = nume;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PersonalSpital [nume=");
		builder.append(nume);
		builder.append("]");
		return builder.toString();
	}
	
	
}
