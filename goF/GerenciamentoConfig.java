package goF;

public class GerenciamentoConfig {

private static GerenciamentoConfig instance;
	
	private String properties="\n app.name = Sistema Empresarial "
			+ "\n urls.bd = jdbc:as400://[host] "
			+ "\n api.keys =  12345-abcde"
			+ "\n limite.recursos = 100";

	
	private GerenciamentoConfig() {
		System.out.println();
	}
	
	public static GerenciamentoConfig getInstance() {
		if(instance == null) {
			instance = new GerenciamentoConfig();
		}
		return instance;
	}
	
	public String getProperties() {
		return properties;
	}
	
	public String setProperties(String newProperties) {
		properties = newProperties;
		return properties;
	}
}

