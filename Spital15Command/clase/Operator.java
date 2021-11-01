package Spital15Command.clase;

import java.util.ArrayList;
import java.util.List;

public class Operator {
	private List<Comanda> comenzi;
	
	public Operator() {
		this.comenzi= new ArrayList<>();
	}
	
	public void invoca(Comanda comanda) {
		this.comenzi.add(comanda);
	}
	
	public void executa() {
		comenzi.get(0).executa();
		comenzi.remove(0);
	}
}
