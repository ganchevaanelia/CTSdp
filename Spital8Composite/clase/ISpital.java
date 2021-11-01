package Spital8Composite.clase;

public interface ISpital {
	public void afiseazaDenumire();
	public void addNod(ISpital departament) throws Exception;
	public void removeNod(ISpital departament) throws Exception;
	public ISpital getNod(int pozitie) throws Exception;
}
