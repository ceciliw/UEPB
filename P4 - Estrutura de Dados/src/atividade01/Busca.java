package atividade01;

public class Busca implements Busca_IF {
	
	int i;
	
	public int[] geraVetorNumericoOrdenado(int tamanho) {
		// só para gerar o vetor preenchido
		int[] vetor = new int[tamanho];
		for (i = 0; i < tamanho; i++) {
			vetor[i] = i;
		}
		return vetor;
	}

	public boolean buscaLinear_iterativa(int[] numeros, int k) {
		// procurar o numero na lista
		for (i = 0; i < numeros.length-1; i++) {
			if (k == numeros[i]) {
				return true;
			}
		}
		return false;
	}

	public boolean buscaLinear_recursiva(int[] numeros, int k) {
		// procurar de forma recursiva
		if (busca_lin_rec(numeros,k,0) == 1) {
			return true;
		}
		return false;
	}
	
	public boolean buscaLinear_iterativa_duasPontas (int[] numeros, int k) {
		// procurar pelas duas pontas
		int j = numeros.length-1;
		for (i = 0; i < numeros.length-1; i++) {
			if (numeros[i] == k || numeros[j] == k) {
				return true;
			}
			j = j-1;
		}
		return false;
	}

	public boolean buscaBinaria_iterativa(int[] numeros, int k) {
		// divide pela metade
		int inicio = 0, meio, fim = numeros.length;
		while (inicio < fim) {
			meio = (inicio + fim) / 2;
			if (k == numeros[meio]) {
				return true;
			} else if (k < numeros[meio]) {
				fim = meio-1;
			} else if (k > numeros[meio]) {
				inicio = meio+1;
			}
		}
		return false;
	}

	public boolean buscaBinaria_recursiva(int[] numeros, int k) {
		// recursivo
		if (busca_bin_rec(numeros,k,0,numeros.length) == 1) {
			return true;
		}
		return false;
	}
	
	public static int busca_lin_rec (int[] numeros, int k, int aux) {
		
		if (aux < numeros.length) {
			if (numeros[aux] == k) {
				return 1;
			} else {
				busca_lin_rec(numeros, k, aux+1);
			}
		}
		return 0;
	}
	public static int busca_bin_rec (int[] numeros, int k, int inicio, int fim) {
		
		if (inicio < fim) {
			int meio = (inicio + fim) / 2;
			if (k == numeros[meio]) {
				return 1;
			} else if (k < numeros[meio]) {
				fim = meio-1;
				busca_bin_rec(numeros, k, inicio, fim);
			} else if (k > numeros[meio]) {
				inicio = meio+1;
				busca_bin_rec(numeros, k, inicio, fim);
			}
		}
		return 0;
	}
}
