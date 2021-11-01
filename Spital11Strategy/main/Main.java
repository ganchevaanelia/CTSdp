package Spital11Strategy.main;

import Spital11Strategy.clase.*;

public class Main {

	public static void main(String[] args) {
		Pacient pacient = new Pacient("Ana");
		pacient.plateste(30);
		pacient.setTipPlata(new PlataCard());
		pacient.plateste(50);

	}

}
