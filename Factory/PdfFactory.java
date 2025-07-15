package Factory;

public class PdfFactory extends RelatorioFactory {

	@Override
	public Relatorio criarRelatorio() {
		// TODO Auto-generated method stub
		return new PDF();
	}

}
