package CreditEuChain.clase;

public class VerificareSalariu extends Handler {

	@Override
	public void trimiteVerificare(Client client) {
		if (client.getSalariu() < 2500) {
			System.out.println("Credit respins, caz salariu");
			System.out.println(client.getNume() + client.getVarsta() + client.getSalariu());
		} else {
			System.out.println("Credit acceptat");
			System.out.println(client.getNume() + client.getVarsta() + client.getSalariu());
		}
	}
}
