package Spital15Command.clase;

public class ComandaLaInternare extends Comanda{

	public ComandaLaInternare(Pacient pacient) {
		super(pacient);
	}

	@Override
	public void executa() {
		super.pacient.mergeLaInternare();		
	}
}
