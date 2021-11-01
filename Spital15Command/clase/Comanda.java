package Spital15Command.clase;

public abstract class Comanda {
	protected Pacient pacient;

	public Comanda(Pacient pacient) {
		super();
		this.pacient = pacient;
	}
	
	public abstract void executa();
}
