package atividade02;
import java.util.Arrays;
import java.util.Random;

public class Ordenacao implements Ordenacao_IF {
	
	public boolean checaVetorOrdenado(int[] numeros) {
		for (int i = 0; i < numeros.length-1; i++) {
			if (numeros[i] > numeros [i+1]) {
				return true;
		}	}
		return false;
	}

	
	public long bubbleSort(int[] numeros) {
		long antes = System.nanoTime();
		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros.length-1; j++) {
				if (numeros[j] > numeros[j+1]) {
					troca(numeros, j, j+1);
		}	}	}	
		long depois = System.nanoTime();
		return depois-antes;
	}

	
	public long selectionSort(int[] numeros) {
		long antes = System.nanoTime();
		int menor;
		for (int i = 0; i < numeros.length-1; i++) {
			menor = i;
			for (int j = (i+1); j < numeros.length; j++) {
				if (numeros[j] < numeros[menor]) {
					menor = j;
				}
			}
			troca(numeros, i, menor);
		}	
		long depois = System.nanoTime();
		return depois-antes;
	}

	
	public long insertionSort(int[] numeros) {
		long antes = System.nanoTime();
		int i, j, atual;
		for (i = 2; i < numeros.length; i++) {
			atual = numeros[i];
			j = i-1;
			while (j >= 0 && numeros[j] > atual) {
				numeros[j+1] = numeros[j];
				j--;
			}
			numeros[j+1] = atual;
		}	
		long depois = System.nanoTime();
		return depois-antes;
	}

	
	public long mergeSort(int[] numeros) {
		long antes = System.nanoTime();
		int tamanho = numeros.length;
			
		if (tamanho < 2) {
			return 0;
		} 
		
		int metade = tamanho/2;
		int[] array_esquerdo = new int[metade];
		int[] array_direito = new int[tamanho-metade];
			
		for (int i = 0; i < metade; i++) {
			array_esquerdo[i] = numeros[i];
		}
		for (int i = metade; i < tamanho; i++) {
			array_direito[i - metade] = numeros[i];
		}
		mergeSort(array_direito);
		mergeSort(array_esquerdo);
			
		merge(numeros, array_esquerdo, array_direito);
		
		long depois = System.nanoTime();
		return depois-antes;
	}

	
	public long quickSort(int[] numeros) {
		long antes = System.nanoTime();
			
		funcao_quicksort(numeros, 0, numeros.length-1);
		
		long depois = System.nanoTime();
		return depois-antes;
	}

	
	public long random_quickSort(int[] numeros) {
		long antes = System.nanoTime();
			
		funcao_quicksort_aleatorio(numeros, 0, numeros.length-1);
			
		long depois = System.nanoTime();
		return depois-antes;
	}

	
	public long quickSort_Java(int[] numeros) {
		long antes = System.nanoTime();
		if (checaVetorOrdenado(numeros))
			Arrays.sort(numeros);
		long depois = System.nanoTime();
		return depois-antes;
	}
	
	
	public long countingSort(int[] numeros) {
		long antes = System.nanoTime();
		
		int[] numeros2 = new int[numeros.length+1];	
		int maior = numeros[0];
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] > maior)
				maior = numeros[i];
		}
		funcao_countingsort(numeros, numeros2, maior);
			
		long depois = System.nanoTime();
		return depois-antes;
	}
	
	//funcoes auxiliares
	public static void troca (int[] array, int indexi, int indexj ) {
		int aux = array[indexi];
		array[indexi] = array[indexj];
		array[indexj] = aux;
	}
	
	public static void merge (int[] original, int[] esquerda, int[] direita) {
		int tam_esq = esquerda.length;
		int tam_dir = direita.length;
		int i = 0, j = 0, k = 0;
		
		while (i < tam_esq && j < tam_dir) {
			if (esquerda[i] <= direita[j]) {
				original[k] = esquerda[i++];
			} else {
				original[k] = direita[j++];
			}
			k++;
		}
		while (i < tam_esq) {
			original[k++] = esquerda[i++];
		}
		while (j < tam_dir) {
			original[k++] = direita[j++];
		}
	}
	
	public static void funcao_quicksort (int vetor[], int esquerda, int direita) {
		if (esquerda < direita) {
			int pivo = vetor[esquerda];
			pivo = particao(vetor, esquerda, direita, pivo);
			funcao_quicksort(vetor, esquerda, pivo-1);
			funcao_quicksort(vetor, pivo+1, direita);
		}
	}
	public static void funcao_quicksort_aleatorio (int vetor[], int esquerda, int direita) {
		if (esquerda < direita) {
			
		int pivo_index = new Random().nextInt(direita-esquerda) + esquerda;
		int pivo = vetor[pivo_index];
		pivo = particao(vetor, esquerda, direita, pivo);
		
		funcao_quicksort(vetor, esquerda, pivo-1);
		funcao_quicksort(vetor, pivo+1, direita);
		}
	}
	public static int particao (int vetor[], int esquerda, int direita,int pivo) {
		int i = esquerda+1;
		int j = direita;
		
		while (i <= j) {
			if (vetor[i] <= pivo) {
				i++;
			} else if (vetor[j] > pivo) {
				j--;
			} else {
				troca(vetor, i, j);
			}
		}
		vetor[esquerda] = vetor[j];
		vetor[j] = pivo;
		return j;
	}
	
	public static void funcao_countingsort (int A[], int B[], int k) {
		int i;
		int[] C = new int[k+1];
		
		for (i = 0; i < A.length; i++) {
			C[A[i]]++;
		}
		for (i = 2; i < C.length; i++) {
			C[i] += C[i-1];
		}
		for (i = A.length-1; i >= 0; i--) {
			B[C[A[i]]-1] = A[i];
			C[A[i]]--;
		}
		for (i = 0; i < A.length; i++) {
            A[i] = B[i];
        }
	}
	
}
