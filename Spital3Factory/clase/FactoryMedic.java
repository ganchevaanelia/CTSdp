package Spital3Factory.clase;

public class FactoryMedic implements IFactory{

	@Override
	public PersonalSpital getPersonal(String nume) {
		return new Medic(nume);
	}

}
