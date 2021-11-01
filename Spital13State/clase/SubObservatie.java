package Spital13State.clase;

public class SubObservatie implements Stare{

	@Override
	public void modificaStare(Pacient pacient) {
		if (pacient.getStare() instanceof SubObservatie) {
			System.out.println("Deja sub observatie");
		} else {
			if (pacient.getStare() instanceof Internat) {
			pacient.setStare(this);
			System.out.println(pacient.getNume() + "este sub observatie");
			}
			else {
			System.out.println("Pacinetul nu exista"); }
		}	
		
	}

}
