package Spital13State.main;

import Spital13State.clase.Pacient;

public class Main {

	public static void main(String[] args) {
		Pacient pacient = new Pacient("Ana");
		pacient.observaPacient();
		pacient.observaPacient();
		pacient.externeazaPacient();
		pacient.observaPacient();
	}
}
