package Spital9Proxy.clase;

public class OperatorInternareProxy implements IInternare{
	OperatorInternare operator;
	
	public OperatorInternareProxy(OperatorInternare operator) {
		super();
		this.operator = operator;
	}

	@Override
	public void internare(boolean asigurare) {
		if(asigurare) {operator.internare(asigurare); }
		else {
			System.out.println("se interneaza doar persoana cu asigurare");
		}		
	}
}
