package LocuintaStrategy.clase;

public class SelectiePretMP implements ISelectie{

	@Override
	public void selecteaza(Locuinta locuinta) {
		System.out.println("Varianta cu pret pe metru patrat "+locuinta.getPretMP());
	}
}
