package goF;

public class ConexaoDados {

	private static ConexaoDados instance;

	
	private ConexaoDados(){
		System.out.println("Conexão com banco de dados estabelecida");	
	}
	
	public static ConexaoDados getInstance() {
		if(instance==null) {
			instance = new ConexaoDados();
		}
		return instance;
	}
}
