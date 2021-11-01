package Spital7Decorator.clase;

public class DecoratorPuneRezultat extends DecoratorAbstract{

	public DecoratorPuneRezultat(IRezultat rez) {
		super(rez);
	}

	public void printeazaRezultat() {
		super.printeazaRezultat();
	}
	
	@Override
	public void puneRezultatOnline() {
		System.out.println("Rezultatul s-a pus online.");
	}
}
