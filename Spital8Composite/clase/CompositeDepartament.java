package Spital8Composite.clase;

import java.util.ArrayList;
import java.util.List;

public class CompositeDepartament implements ISpital {
	private List<ISpital> listaDepartamente;

	public CompositeDepartament() {
		this.listaDepartamente = new ArrayList<>();
	}

	@Override
	public void afiseazaDenumire() {
		System.out.println("este departament");
		for (ISpital dep : listaDepartamente) {
			dep.afiseazaDenumire();
		}
	}

	@Override
	public void addNod(ISpital departament){
		listaDepartamente.add(departament);

	}

	@Override
	public void removeNod(ISpital departament){
		listaDepartamente.remove(departament);

	}

	@Override
	public ISpital getNod(int pozitie) {
		return listaDepartamente.get(pozitie);

	}

}
