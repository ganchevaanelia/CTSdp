package Spital13State.clase;

public class Externat implements Stare {

	@Override
	public void modificaStare(Pacient pacient) {
		if (pacient.getStare() instanceof Externat) {
			System.out.println("Deja externat");
		} else {
			if (pacient.getStare() instanceof Internat || pacient.getStare() instanceof SubObservatie) {
				pacient.setStare(this);
				System.out.println(pacient.getNume() + "este internat");
			} else {
				System.out.println("Pacientul nu exista");
			}
		}
	}
}
