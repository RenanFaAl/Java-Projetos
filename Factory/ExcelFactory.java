package Factory;

public class ExcelFactory extends RelatorioFactory{

	@Override
	public Relatorio criarRelatorio() {
		// TODO Auto-generated method stub
		return new Excel();
	}

}
