package CreditEuChain.clase;

public class VerificareVarsta extends Handler {

	@Override
	public void trimiteVerificare(Client client) {
		if (client.getVarsta() < 21 || client.getVarsta() > 60) {
			System.out.println("Credit respins, caz varsta");
			System.out.println(client.getNume() + client.getVarsta() + client.getSalariu());
		} else {
			this.getHandler().trimiteVerificare(client);
		}
	}
}
