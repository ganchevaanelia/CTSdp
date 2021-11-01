package Spital6Facade.clase;

public class Medic {
	public static boolean trebuieInternat(Pacient pacient) {
		if (pacient.getStare() == "grav") {
			return true;
		} else {
			return false;
		}
	}
}
