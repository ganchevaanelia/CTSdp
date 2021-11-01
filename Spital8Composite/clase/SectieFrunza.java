package Spital8Composite.clase;

public class SectieFrunza implements ISpital{
	private String numeSectie;
	
	
	
	public SectieFrunza(String numeSectie) {
		super();
		this.numeSectie = numeSectie;
	}

	@Override
	public void afiseazaDenumire() {
		System.out.println("Denumire sectia " + numeSectie);	
	}

	@Override
	public void addNod(ISpital departament) throws Exception {
		throw new Exception ("neimplementat");
	}

	@Override
	public void removeNod(ISpital departament)throws Exception {
		throw new Exception ("neimplementat");
	}

	@Override
	public ISpital getNod(int pozitie) throws Exception {
		throw new Exception ("neimplementat");
	}

}
