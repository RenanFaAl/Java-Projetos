package Factory;



public class Principalç {
	
	RelatorioFactory factory1 = new ExcelFactory();
	Relatorio relatorio1 = factory1.criarRelatorio();
	
	 
	RelatorioFactory factory2 = new PdfFactory();
	Relatorio pdf = factory2.criarRelatorio();
	 
	 
	RelatorioFactory factory3 = new CSVFactory();
	Relatorio csv = factory3.criarRelatorio();
	
	//fábrica de navios
	 
	

	}

	



