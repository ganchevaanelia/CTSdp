package Spital15Command.clase;

public class ComandaLaTratare extends Comanda{

	public ComandaLaTratare(Pacient pacient) {
		super(pacient);
	}

	@Override
	public void executa() {
		super.pacient.mergeLaTratare();		
	}
}
