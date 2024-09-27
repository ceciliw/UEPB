package atividade02;

/*
 * Interface para implementa��o da classe "Ordenacao".
 * O m�todo booleano deve retornar 'false' se 'numeros' n�o estiver ordenado (crescente). 
 */
public interface Ordenacao_IF {
	
	boolean checaVetorOrdenado(int[] numeros);
	
	long bubbleSort(int[] numeros);
	
	long selectionSort(int[] numeros);
	
	long insertionSort(int[] numeros);
	
	long mergeSort(int[] numeros);
	
	long quickSort(int[] numeros);
	
	long random_quickSort(int[] numeros);
	
	long quickSort_Java(int[] numeros);
	
	long countingSort(int[] numeros);
	
}
