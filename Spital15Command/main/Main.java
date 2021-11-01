package Spital15Command.main;

import Spital15Command.clase.*;

public class Main {

	public static void main(String[] args) {
		Pacient pacient1 = new Pacient("Ion");
		Pacient pacient2 = new Pacient("Marius");
		
		Comanda comandaInternare = new ComandaLaInternare(pacient1);
		Comanda comandaTratare1 = new ComandaLaTratare(pacient1);
		Comanda comandaTratare2 = new ComandaLaTratare(pacient2);
		
		Operator operator = new Operator();
		operator.invoca(comandaInternare);
		operator.invoca(comandaTratare1);
		operator.executa();
		operator.invoca(comandaTratare2);
		operator.executa();
		operator.executa();
	}
}
