package LocuintaStrategy.clase;

public class ClientNou {
	private String nume;
	private int buget;
	private ISelectie selectie;
	
	public ClientNou(String nume, int buget) {
		super();
		this.nume = nume;
		this.buget = buget;
		this.selectie=new SelectiePretMP();
	}

	public void setSelectie(ISelectie selectie) {
		this.selectie = selectie;
	}

	public void selecteaza(Locuinta locuinta) {
		this.selectie.selecteaza(locuinta);
	}
}
