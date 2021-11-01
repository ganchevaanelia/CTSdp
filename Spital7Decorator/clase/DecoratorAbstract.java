package Spital7Decorator.clase;

public abstract class DecoratorAbstract implements IRezultat{
	private IRezultat rez;

	public DecoratorAbstract(IRezultat rez) {
		super();
		this.rez = rez;
	}

	@Override
	public void printeazaRezultat() {
		rez.printeazaRezultat();
	}
	
	public abstract void puneRezultatOnline();

}
