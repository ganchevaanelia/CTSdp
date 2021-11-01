package CreditEuChain.main;

import CreditEuChain.clase.*;

public class Main {

	public static void main(String[] args) {
		Client client1 = new Client("Ana", 15, 2600);
		Client client2 = new Client("Maria", 45, 4500);
		Client client3 = new Client("Ion", 45, 1200);
		
		VerificareVarsta verificareVarsta = new VerificareVarsta();
		VerificareSalariu verificareSalariu = new VerificareSalariu();
		verificareVarsta.setHandler(verificareSalariu);
		
		verificareVarsta.trimiteVerificare(client1);
		verificareVarsta.trimiteVerificare(client2);
		verificareVarsta.trimiteVerificare(client3);
	}
}
