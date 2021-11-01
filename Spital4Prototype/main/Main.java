package Spital4Prototype.main;

import Spital4Prototype.clase.Reteta;

public class Main {

	public static void main(String[] args) {
		Reteta reteta1 = new Reteta ("Analgin", 37);
		Reteta reteta2 = (Reteta) reteta1.clone();
		
		System.out.println(reteta1);
		System.out.println(reteta2);
	}

}
