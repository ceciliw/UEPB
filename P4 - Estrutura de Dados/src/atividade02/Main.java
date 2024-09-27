package atividade02;
import java.util.Random;

public class Main {
	
	public static void main(String[] args) {
		
		Ordenacao_IF ordena = new Ordenacao();
		
		Random aleatorio = new Random();
		
		int i;
		int tamanho = 10;
		int n = 50;
		int soma = 0;
		int[] vetor = new int[tamanho]; 
		
		for (i = 0; i < tamanho; i++) {
			vetor[i] = aleatorio.nextInt(100);
		}
		
		//BUBBLE------------------------------------------
		/*System.out.println("BUBBLE SORT\naleatorio: ");
		int[] bubble = copiar_vetor(vetor);
		
		for (i = 0; i < n; i++) {
			soma += ordena.bubbleSort(bubble);
		}
		System.out.println(soma/n);
		soma = 0;
		System.out.println("crescente: ");
		for (i = 0; i < n; i++) {
			soma += ordena.bubbleSort(bubble);
		}
		System.out.println(soma/n);
		soma = 0;
		System.out.println("decrescente: ");
		inverter(bubble);
		for (i = 0; i < n; i++) {
			soma += ordena.bubbleSort(bubble);
		}
		System.out.println(soma/n);
		soma = 0;
		//SELECTION-----------------------------------------------------
		System.out.println("\nSELECTION SORT\naleatorio: ");
		int[] selection = copiar_vetor(vetor);
		for (i = 0; i < n; i++) {
			soma += ordena.selectionSort(selection);
		}
		System.out.println(soma/n);
		soma = 0;
		System.out.println("crescente: ");
		for (i = 0; i < n; i++) {
			soma += ordena.selectionSort(selection);
		}
		System.out.println(soma/n);
		soma = 0;
		System.out.println("decrescente: ");
		inverter(selection);
		for (i = 0; i < n; i++) {
			soma += ordena.selectionSort(selection);
		}
		System.out.println(soma/n);	
		soma = 0;	
		//INSERTION----------------------------
		System.out.println("\nINSERTION SORT\naleatorio: ");
		int[] insertion = copiar_vetor(vetor);
		for (i = 0; i < n; i++) {
			soma += ordena.insertionSort(insertion);
		}
		System.out.println(soma/n);
		soma = 0;
		System.out.println("crescente: ");
		for (i = 0; i < n; i++) {
			soma += ordena.insertionSort(insertion);
		}
		System.out.println(soma/n);
		soma = 0;
		System.out.println("decrescente: ");
		inverter(insertion);
		for (i = 0; i < n; i++) {
			soma += ordena.insertionSort(insertion);
		}
		System.out.println(soma/n);
		soma = 0;	*/	
		//MERGE---------------------------------------------
		System.out.println("\nMERGE SORT\naleatorio: ");
		int[] merge = copiar_vetor(vetor);
		for (i = 0; i < n; i++) {
			soma += ordena.mergeSort(merge);
		}
		System.out.println(soma/n);
		soma = 0;
		System.out.println("crescente: ");
		for (i = 0; i < n; i++) {
			soma += ordena.mergeSort(merge);
		}
		System.out.println(soma/n);
		soma = 0;
		System.out.println("decrescente: ");
		inverter(merge);
		for (i = 0; i < n; i++) {
			soma += ordena.mergeSort(merge);
		}
		System.out.println(soma/n);		
		soma = 0;
		//QUICK---------------------------------------------------
		System.out.println("\nQUICK SORT\naleatorio: ");
		int[] quick = copiar_vetor(vetor);
		for (i = 0; i < n; i++) {
			soma += ordena.quickSort(quick);
		}
		System.out.println(soma/n);
		soma = 0;
		System.out.println("crescente: ");
		for (i = 0; i < n; i++) {
			soma += ordena.quickSort(quick);
		}
		System.out.println(soma/n);
		soma = 0;
		System.out.println("decrescente: ");
		inverter(quick);	
		for (i = 0; i < n; i++) {
			soma += ordena.quickSort(quick);
		}
		System.out.println(soma/n);		
		soma = 0;/*
		//RENDOM--------------------------------------------------------
		System.out.println("\nRANDOM QUICK SORT\naleatorio: ");
		int[] random = copiar_vetor(vetor);
		for (i = 0; i < n; i++) {
			soma += ordena.random_quickSort(random);
		}
		System.out.println(soma/n);
		soma = 0;
		System.out.println("crescente: ");
		for (i = 0; i < n; i++) {
			soma += ordena.random_quickSort(random);
		}
		System.out.println(soma/n);
		soma = 0;
		System.out.println("decrescente: ");
		inverter(random);
		for (i = 0; i < n; i++) {
			soma += ordena.random_quickSort(random);
		}
		System.out.println(soma/n);
		soma = 0;*/
		//JAVA--------------------------------------------------
		System.out.println("\nQUICK SORT JAVA\naleatorio: ");
		int[] java = copiar_vetor(vetor);
		for (i = 0; i < n; i++) {
			soma += ordena.quickSort_Java(java);
		}
		System.out.println(soma/n);
		soma = 0;
		System.out.println("crescente: ");
		for (i = 0; i < n; i++) {
			soma += ordena.quickSort_Java(java);
		}
		System.out.println(soma/n);
		soma = 0;
		System.out.println("decrescente: ");
		inverter(java);	
		for (i = 0; i < n; i++) {
			soma += ordena.quickSort_Java(java);
		}
		System.out.println(soma/n);		
		soma = 0;/*
		//COUNTING-------------------------------------------------
		System.out.println("\nCOUNTING SORT\naleatorio: ");
		int[] counting = copiar_vetor(vetor);
		for (i = 0; i < n; i++) {
			soma += ordena.countingSort(counting);
		}
		System.out.println(soma/n);
		soma = 0;
		System.out.println("crescente: ");
		for (i = 0; i < n; i++) {
			soma += ordena.countingSort(counting);
		}
		System.out.println(soma/n);
		soma = 0;
		System.out.println("decrescente: ");
		inverter(counting);	
		for (i = 0; i < n; i++) {
			soma += ordena.countingSort(counting);
		}
		System.out.println(soma/n);	
		soma = 0;*/
	}
	public static int[] copiar_vetor (int[] original) {
		int n = original.length;
		int[] copiar = new int[n];
		
		for (int i = 0; i < n; i++) {
			copiar[i] = original[i];
		}
		return copiar;
	}
	public static void inverter (int[] vetor) {
		int i = 0, aux, tam = vetor.length-1;
		while (i < tam) {
			aux = vetor[i];
			vetor[i] = vetor[tam];
			vetor[tam] = aux;
			i++;
			tam--;
		}
	}
	public static void printar (int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ");
		}
	}
}
