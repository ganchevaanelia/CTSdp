package CreditEuChain.clase;

public abstract class Handler {
	private Handler handler;

	public void setHandler(Handler handler) {
		this.handler = handler;
	}

	public Handler getHandler() {
		return handler;
	}

	public abstract void trimiteVerificare(Client client);
}
