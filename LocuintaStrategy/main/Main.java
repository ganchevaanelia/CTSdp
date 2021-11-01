package LocuintaStrategy.main;

import java.util.ArrayList;
import java.util.List;

import LocuintaStrategy.clase.*;

public class Main {

	public static void main(String[] args) {
		List<Locuinta> lista = new ArrayList<>();
		
		Locuinta locuinta1 = new Locuinta(1,300,3);
		Locuinta locuinta2 = new Locuinta(2,350,4);
		Locuinta locuinta3 = new Locuinta(3,450,2);
		
		lista.add(locuinta1);
		lista.add(locuinta2);
		lista.add(locuinta3);
		
		ClientNou client = new ClientNou("Ion",890000);
		for (Locuinta loc : lista) {
		client.selecteaza(loc);
		client.setSelectie(new SelectieNrCamere());
		client.selecteaza(loc);
		client.setSelectie(new SelectiePretMP());
		}
	}

}
