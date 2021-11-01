package Spital6Facade.main;

import Spital6Facade.clase.*;

public class Main {

	public static void main(String[] args) {
		Pat pat1 = new Pat(false);
		Pat pat2 = new Pat(false);
		Salon.adaugaPat(pat1);
		Salon.adaugaPat(pat2);
		
		Pacient pacient1 = new Pacient("Ana", "grav");
		if (SpitalFacade.seInterneaza(pacient1)) {
			System.out.println("Pacientul se interneaza");
		}
		else {
			System.out.println("Pacientul nu se interneaza");
		}
		
		Pacient pacient2 = new Pacient("Ana", "bine");
		if (SpitalFacade.seInterneaza(pacient2)) {
			System.out.println("Pacientul se interneaza");
		}
		else {
			System.out.println("Pacientul nu se interneaza");
		}

	}

}
