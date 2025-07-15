package Factory;

public class CSVFactory extends RelatorioFactory {

	@Override
	public Relatorio criarRelatorio() {
		// TODO Auto-generated method stub
		return new CSV();
	}

}
