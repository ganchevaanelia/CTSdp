package Spital1Builder.main;

import Spital1Builder.clase.*;

public class Main {

	public static void main(String[] args) {
		Pacient internare1;
		Pacient internare2;

		internare2 = new PacientBuilder().setCodInternare(2).setAreHalat(true).build();
		
		Pacient internare3 = new Pacient(3,true, true, true, true);
		
		PacientBuilderBuild internareBuild = new PacientBuilderBuild().setCodInternare(4).setAreMicDejun(true);
		
		Pacient internare5 = internareBuild.setCodInternare(5).build();
		
		System.out.println(internare2);
		System.out.println(internare3);
		System.out.println(internare5);
	}

}
