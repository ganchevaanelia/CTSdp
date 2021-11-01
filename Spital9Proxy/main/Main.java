package Spital9Proxy.main;

import Spital9Proxy.clase.*;

public class Main {

	public static void main(String[] args) {
		OperatorInternare operator = new OperatorInternare();
		operator.internare(false);
		
		OperatorInternareProxy proxy = new OperatorInternareProxy(operator);
		proxy.internare(false);
		proxy.internare(true);
	}
}
