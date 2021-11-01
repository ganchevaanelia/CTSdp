package Spital13State.clase;

public class Internat implements Stare{

	@Override
	public void modificaStare(Pacient pacient) {
		if (pacient.getStare() instanceof Internat) {
			System.out.println("Deja internat");
		} else {
			pacient.setStare(this);
			System.out.println(pacient.getNume() + "este internat");
		}	
	}
}
