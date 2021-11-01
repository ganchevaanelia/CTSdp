package LocuintaStrategy.clase;

public class SelectieNrCamere implements ISelectie{
	
	@Override
	public void selecteaza(Locuinta locuinta) {
		System.out.println("Varianta cu numar camere "+locuinta.getNrCamere());
	}
}
