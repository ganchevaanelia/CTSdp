package Spital4Prototype.clase;

public class Reteta implements PrototipAbstract{
	private String denumireSolutie;
	private int cantitate;
	public Reteta(String denumireSolutie, int cantitate) {
		if (denumireSolutie.length() >2 && cantitate>0) {
		this.denumireSolutie = denumireSolutie;
		this.cantitate = cantitate;
		}
		else
		{
			this.denumireSolutie = "nimic";
			this.cantitate =0;
		}
	}
	public Reteta() {
		this.denumireSolutie = "nimic";
		this.cantitate =0;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Reteta [denumireSolutie=");
		builder.append(denumireSolutie);
		builder.append(", cantitate=");
		builder.append(cantitate);
		builder.append("]");
		return builder.toString();
	}

	public PrototipAbstract clone() {
		Reteta copie = new Reteta();
		copie.cantitate = this.cantitate;
		copie.denumireSolutie = this.denumireSolutie;
		return copie;
	}

	
}
