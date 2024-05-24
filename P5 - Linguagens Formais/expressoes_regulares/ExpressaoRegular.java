package expressoes_regulares;

public class ExpressaoRegular {

	private final String L1 = "(a|b)*(aa|bb)";
	private final String L2 = "a(a|b)*a";
	
	public void confere (String exp, String sentenca) {
		if (sentenca != null && !sentenca.isEmpty()) {
			if (sentenca.matches(exp)) {
				System.out.println("W:'"+sentenca+"'..... ACEITA!");
			} else {
				System.err.println("W:'"+sentenca+"'..... rejeitada.");
			}
		} else {
			System.err.println("Sentença vazia.");
		}
	}

	public String getL1() { return L1; }
	
	public String getL2() { return L2; }
	
}
