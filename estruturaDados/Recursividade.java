package estruturaDados;

public class Recursividade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int produto;
		produto=ex3(4,2);
		
		int fibo;
		fibo = fibonacci(5);
		
		int fat;
		fat = fatorial(5);
		
		
		System.out.println(produto);
		System.out.println(fibo);
		System.out.println(fat);
	}

	private static int ex3(int i, int j) {
		// recebe 2 valores inteiros e retorna o produto
		// i * j, mas sem usar * ou / e laços
		if(i == 1) {
			return j;
		}
		return j+ ex3(i-1,j);
	}

	private static int fibonacci(int i) {
		if(i == 1) {
			return 1;
		}
		if (i == 0) {
			return 0;
		}
		return fibonacci(i-1)+ fibonacci(i-2);
	}
	
	private static  int fatorial(int i) {
		if (i <= 1) {
			return 1;
		}
		return i * fatorial(i-1);
	}
}
