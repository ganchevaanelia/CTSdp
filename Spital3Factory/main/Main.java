package Spital3Factory.main;

import Spital3Factory.clase.*;

public class Main {

	public static void afisareInfoPersonal(IFactory factory, String nume)
	{
		PersonalSpital personalSpital = factory.getPersonal(nume);
		System.out.println(personalSpital.toString());
	}
	
	public static void main(String[] args) {
		afisareInfoPersonal(new FactoryMedic(), "Ion");
		afisareInfoPersonal(new FactoryAsistent(), "Dan");

	}

}
