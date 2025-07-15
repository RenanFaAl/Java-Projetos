package Factory;
import javax.swing.JOptionPane;
public class Main {
   public static void main(String[] args) {
       int op;
       String menu = "\nBem-vindo ao Sistema de Relatórios. "
               + "\n1. Excel \n2. PDF "
               + "\n3. CSV"
               + "\n0. Sair \nEscolha uma opção";
       // Fábricas
       RelatorioFactory factory1 = new ExcelFactory();
       RelatorioFactory factory2 = new PdfFactory();
       RelatorioFactory factory3 = new CSVFactory();
     
       do {
           op = Integer.parseInt(JOptionPane.showInputDialog(menu));
           switch (op) {
               case 1: {
                   Relatorio excel = factory1.criarRelatorio();
                   excel.fazerRelatorio();
                   break;
               }
               case 2: {
                   Relatorio pdf = factory2.criarRelatorio();
                   pdf.fazerRelatorio();
                   break;
               }
               case 3: {
                   Relatorio csv = factory3.criarRelatorio();
                   csv.fazerRelatorio();
                   break;
               }
               case 0: {
                   System.out.println("Saindo");
                   break;
               }
               default:
                   System.out.println("Escolha uma opção válida");
           }
       } while (op != 0); 
}
}
