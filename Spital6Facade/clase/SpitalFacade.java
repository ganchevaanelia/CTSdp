package Spital6Facade.clase;

public class SpitalFacade {

	public static boolean seInterneaza(Pacient pacient) {
		if (pacient.getStare() == "grav" && Medic.trebuieInternat(pacient) && Salon.verificaPatLiber(pacient)) {
			return true;
		} else {
			return false;
		}
	}
}
