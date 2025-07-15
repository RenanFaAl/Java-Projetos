package goF;

public class TesteGerenciamento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GerenciamentoConfig config = GerenciamentoConfig.getInstance();
		
		
		System.out.println(config.getProperties());
		System.out.println(config.setProperties("\n app.name = Sistema Empresarial "
				+ "\n urls.bd = jdbc:as400://[host] "
				+ "\n api.keys =  12345-abcde"
				+ "\n limite.recursos = 200"));
		
	}

}
