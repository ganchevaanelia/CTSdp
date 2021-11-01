package Spital7Decorator.main;

import Spital7Decorator.clase.*;

public class Main {

	public static void main(String[] args) {
		Rezultat rezultat1 = new Rezultat("rezultat 1");
		rezultat1.printeazaRezultat();
		System.out.println();
		
		DecoratorAbstract decoratorPuneRezultat = new DecoratorPuneRezultat(rezultat1);
		decoratorPuneRezultat.puneRezultatOnline();
		System.out.println();
		decoratorPuneRezultat.printeazaRezultat();
	}
}
