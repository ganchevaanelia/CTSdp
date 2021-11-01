package Spital2Factory.clase;
//clasa concreta ce implemeneaza
public class FactoryPersonal {
	public PersonalSpital getPersonal(TipPersonal tipPersonal, String nume) {
		switch (tipPersonal) {
		case Brancardier:
			return new Brancardier(nume);

		case Medic:
			return new Medic(nume);

		case Asistent:
			return new Asistent(nume);

		default:
			throw new IllegalArgumentException();
		}
	}
}
