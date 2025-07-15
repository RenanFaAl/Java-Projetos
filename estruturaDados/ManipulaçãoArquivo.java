package estruturaDados;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ManipulaçãoArquivo {





	 		
	 		static FileReader fr;
	 		static BufferedReader br;
	 		static BufferedWriter bw;
	 		static FileWriter fw;
	 		static final String ARQ_ENTRADA = "C:\\Users\\user\\Desktop\\entrada.txt";
	 		static final String ARQ_SAIDA = "C:\\Users\\user\\Desktop\\saida.txt";
	 		
	 		
	 		
	 		public static void main(String[] args) throws IOException {
	 			fr = new FileReader(ARQ_ENTRADA);
	 			br = new BufferedReader(fr);
	 			fw= new FileWriter(ARQ_SAIDA);
	 			bw= new BufferedWriter(fw);
	 			
	 			//leitura();
	 			//escrita();
	 			//formataDataSubstring();
	 			//formataDataSplit();
	 			//formataNomeSplit();
	 			//questionario();
	 			//MaiusculaInicial();
	 			//ex1Ordenacao();
	 			//ex2nota();
	 			//ex3times();
	 			ex4Campeonato();
	 			
	 			br.close();
	 			bw.close();
	 			fr.close();
	 			fw.close();
	 			
	 		}



	 		private static void ex4Campeonato() throws IOException {
	 			// TODO Auto-generated method stub
	 			int nTimes = Integer.parseInt(br.readLine());
	 			String linha;
	 			String times[] = new String[nTimes];
	 			int pontos[] = new int[nTimes];
	 			int posIni = 2;
	 			for(int i=0; i < nTimes;i++) {
	 				//guardar nome em posição no vetor
	 				times[i] = br.readLine().substring(posIni);
	 				
	 			}
	 				int nPartidas= Integer.parseInt(br.readLine());
	 				for(int j=0; j < nPartidas; j++) {
	 				 linha=br.readLine();
	 				//guardar pontos em cada posição do vetor
	 					String valores[] = linha.split(" ");
	 					int codTimeCasa = Integer.parseInt(valores[0]);
	 					int codTimeFora = Integer.parseInt(valores[1]);
	 					int goltimeCasa = Integer.parseInt(valores[2]);
	 					int goltimeFora = Integer.parseInt(valores[3]);
	 					
	 					if(goltimeCasa>goltimeFora) {
	 						pontos[codTimeCasa]+=3;
	 						
	 				}else if(goltimeFora>goltimeCasa) {
	 						pontos[codTimeFora]+=3;
	 						
	 				}else {
	 					pontos[codTimeCasa]+=1;
	 					pontos[codTimeFora]+=1;
	 				}
	 				
	 				}
	 			//verifica maior pontos
	 				int indMaiorPontos = 0;
	 				int MaiorPontos = 0;
	 				for(int i = 0; i < nTimes; i++) {
	 					if(pontos[i]>MaiorPontos) {
	 						indMaiorPontos = i;
	 						MaiorPontos = pontos[i];
	 						
	 					}
	 				}
	 				System.out.println("Campeão: "+ times[indMaiorPontos] + " - " + MaiorPontos + " pontos");
	 			
	 		}



	 		private static void ex3times() throws IOException {
	 			// TODO Auto-generated method stub
	 			String linha = br.readLine();
	 			while(linha!=null) {
	 				
	 				String times[] = linha.split("-");
	 				double goltime1 = Integer.parseInt(times[times.length-2]);
	 				double goltime2 = Integer.parseInt(times[times.length-1]);
	 				
	 				if (goltime1>goltime2) {
	 					fw.write(linha + " Vencedor: " + times[0]+"\n");
	 					
	 			}else if (goltime2>goltime1) {
	 				fw.write(linha + " Vencedor: " + times[1]+ "\n");
	 				
	 			} else {
	 				fw.write("Empate");
	 				
	 			}
	 				linha=br.readLine();
	 		}
	 		}



	 		private static void ex2nota() throws IOException {
	 			// TODO Auto-generated method stub
	 			String linha = br.readLine();
	 			while(linha!=null) {
	 				
	 				String valores[] = linha.split(" ");
	 				double nota = Double.parseDouble(valores[valores.length-1]);
	 				if (nota >=7) {
	 					fw.write(linha + "\n");
	 			}
	 				linha=br.readLine();
	 		}
	 			//bw.flush();
	 		}
	 			



	 		private static void ex1Ordenacao() throws IOException {
	 			// TODO Auto-generated method stub
	 			ArrayList<String> nomes = new ArrayList<String>();
	 			String linha = br.readLine();
	 			while(linha!=null) {
	 				nomes.add(linha);
	 				linha=br.readLine();
	 			}
	 			Collections.sort(nomes);
	 			for (String nome : nomes) {
	 				bw.write(nome + "\n");
	 			}
	 			bw.flush();
	 		}



	 		private static void MaiusculaInicial() {
	 			// TODO Auto-generated method stub
	 			String nome = "Ricardo Molinari dos Prazeres";
	 			String [] nomes = nome.split(" ");
	 			for(int i=0; i<nomes.length;i++) {
	 				String lower = nomes[i].toLowerCase();
	 				if(!nomes[i].equals(lower)) {
	 					System.out.println((i+1)+"° Nome: " +nomes[i]);
	 				}
	 			}
	 			
	 			
	 		}



	 		private static void questionario() {
	 			// TODO Auto-generated method stub
	 			String resp = "Pedro Álvares Cabral";
	 			String respUsu="  pedro álvares Cabral ";
	 			resp = resp.toLowerCase();
	 			respUsu = respUsu.trim();
	 			respUsu = respUsu.toLowerCase();
	 			if(respUsu.equals(resp)) {
	 				System.out.println("correto");
	 			} else {
	 				System.out.println("incorreto");
	 			}
	 		}



	 		private static void formataNomeSplit() {
	 			// TODO Auto-generated method stub
	 			String nome = "LeBron Raymone James";
	 			String sobrenome [] = nome.split(" ");
	 			System.out.println(sobrenome[sobrenome.length-1]);
	 		}



	 		private static void formataDataSplit() {
	 			// TODO Auto-generated method stub
	 			String dataAme = "2024/09/05";
	 			String [] datanorm = dataAme.split("/");
	 			String dataDia = datanorm [2];
	 			String dataMes = datanorm[1];
	 			String dataAno = datanorm[0];
	 			System.out.println(dataDia+"/"+dataMes+"/"+dataAno);
	 		}



	 		private static void formataDataSubstring() {
	 			// TODO Auto-generated method stub
	 			String dataAme = "2024/09/05";
	 			
	 			int posDia = 8;
	 			int posDF = 10;
	 			int posMI = 5;
	 			int posMF = 7;
	 			int posAI = 0;
	 			int posAF = 4;
	 			String dataDia = dataAme.substring(posDia, posDF);
	 			String dataMes =  dataAme.substring(posMI, posMF);
	 			String dataAno = dataAme.substring(posAI, posAF);
	 			System.out.println(dataDia+"/"+dataMes+"/"+dataAno);
	 			
	 		}



	 		private static void escrita() throws IOException {
	 			// TODO Auto-generated method stub
	 			bw.write("Linha 1");
	 			bw.newLine();
	 			bw.write("Linha 2");
	 			bw.flush();//commit
	 			
	 		}



	 		private static void leitura() throws IOException {
	 			String linha =  br.readLine();
	 			while(linha !=null) {
	 				System.out.println(linha);
	 				linha = br.readLine();
	 			}
	 			
	 		

	 	}

	 }

