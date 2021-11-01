package Spital6Facade.clase;

import java.util.ArrayList;
import java.util.List;

public class Salon {
	private static List<Pat> paturiLista = new ArrayList<>();
	
	public static void adaugaPat(Pat pat) {
		paturiLista.add(pat);
	}
	
	public static boolean verificaPatLiber(Pacient pacient) {
		for (Pat pat : paturiLista) {
			if (!pat.isOcupat()) {pat.setOcupat(true);return true;} 
			 
		} return false;
	}
}
