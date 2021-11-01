package Spital2Factory.main;

import Spital2Factory.clase.*;

public class Main {

	public static void main(String[] args) {
		PersonalSpital medic = new FactoryPersonal().getPersonal(TipPersonal.Medic, "Elena");
		PersonalSpital brancardier = new FactoryPersonal().getPersonal(TipPersonal.Brancardier, "Ion");
		PersonalSpital asistent = new FactoryPersonal().getPersonal(TipPersonal.Asistent, "Ana");
		
		System.out.println(medic);
		System.out.println(brancardier);
		System.out.println(asistent);
	}
}
