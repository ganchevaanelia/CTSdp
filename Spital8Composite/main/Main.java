package Spital8Composite.main;

import Spital8Composite.clase.*;

public class Main {

	public static void main(String[] args) {
		CompositeDepartament departament1 = new CompositeDepartament();
		CompositeDepartament departament2 = new CompositeDepartament();
		CompositeDepartament departament3 = new CompositeDepartament();

		SectieFrunza sectie1 = new SectieFrunza("sectie 1");
		SectieFrunza sectie2 = new SectieFrunza("sectie 2");
		SectieFrunza sectie3 = new SectieFrunza("secite 3");
		
		departament1.addNod(departament2);
		departament1.addNod(sectie1);

		departament2.addNod(sectie2);
		
		departament3.addNod(sectie3);
		
		departament1.afiseazaDenumire();
		System.out.println();
		departament2.afiseazaDenumire();
		System.out.println();
		departament3.afiseazaDenumire();
		System.out.println();
		
		departament1.removeNod(departament2);
		
		departament1.afiseazaDenumire();
		System.out.println();
		departament2.afiseazaDenumire();
		System.out.println();
		departament3.afiseazaDenumire();
		System.out.println();
	}

}
