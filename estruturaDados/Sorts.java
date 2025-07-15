package estruturaDados;

import java.util.Arrays;

public class Sorts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array = { 3,6,4,1,8,2,5,7};
		
		bubbleSort(array);
		//selectionSort(array);
		//insertSort(array);
		
		System.out.println(Arrays.toString(array));

	}

	private static void insertSort(int[] array) {
		// TODO Auto-generated method stub
 		int n = array.length;
		for(int i = 1; i < n;i++) {
			int prox = array[i];
			int j = i - 1;
				while(j>=0 && array[j]>prox) {
					array[j+1] = array[j];
					j--;
			}
				
				array[j+1] = prox;
		}
	}

	private static void selectionSort(int[] array) {
		// TODO Auto-generated method stub
		int min = 0;
		for(int i = 0; i < array.length - 1 ; i++ ) {
			min = i;
			for(int j = 1+i; j <array.length; j++) {
				if(array[min] > array[j]) {
					int aux = array[j];
					array[j] = array[min];
					array[min] = aux;
				}
			}
		}
	}

	private static void bubbleSort(int[] array) {
		// TODO Auto-generated method stub
		int aux = 0;
		
		for(int i = 0; i < array.length-1;i++) {
			for(int j = 0 ; j < array.length-i-1; j++) {
				if (array[j+1]< array[j]){
					aux = array[j+1];
					array[j+1] = array[j];
					array[j]=aux;
				}
			}
		}
	}

}
