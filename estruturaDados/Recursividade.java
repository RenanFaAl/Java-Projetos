package estruturaDados;

public class Recursividade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int produto;
		produto=ex3(4,2);
		System.out.println(produto);
	}

	private static int ex3(int i, int j) {
		// recebe 2 valores inteiros e retorna o produto
		// i * j, mas sem usar * ou / e laços
		if(i == 1) {
			return j;
		}
		return j+ ex3(i-1,j);
	}

}
