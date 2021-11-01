package Spital10Flyweight.main;

import Spital10Flyweight.clase.*;

public class Main {

	public static void main(String[] args) {
		SalonInternare internare1 = new SalonInternare(2,15,7);
		SalonInternare internare2 = new SalonInternare(3,26,7);
		
		FlyweightFactory flyweightFactory = new FlyweightFactory();
		Flyweight pacient1 = flyweightFactory.getFlyweight("0897567898");
		pacient1.printeazaInternari(internare1);
		
		flyweightFactory.getFlyweight("0897567898").printeazaInternari(internare2);
		flyweightFactory.getFlyweight("0898").printeazaInternari(internare2);
	}
}
