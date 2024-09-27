package atividade03;

public class ListaEncadeada implements ListaEncadeada_IF {

	private Integer data;
	private ListaEncadeada proximo;
	
	public ListaEncadeada () {}
	
	public ListaEncadeada (Integer data, ListaEncadeada proximo) { 
		this.data = data;
		this.proximo = proximo;
	}
	
	public boolean isEmpty() {
		return (this.data == null);
	}
	
	public int size() {
		if (this.isEmpty()) {
			return 0;
		} return this.proximo.size() + 1;
	}
	
	public Integer search (Integer element) throws Exception {
		if (this.isEmpty()) {
			return null;
		} 
		if (this.data.equals(element)) {
			return element;
		} return this.proximo.search(element);	
	}
	
	public void insert(Integer element) { // inserir no inicio
		ListaEncadeada novo = new ListaEncadeada(this.data, this.proximo); 
		this.data = element;
		this.proximo = novo;
	}
	
	public void remove(Integer element) {
		if (this.isEmpty()) {
			return;
		}
		if (this.data.equals(element)) {
			this.data = this.proximo.data;
			this.proximo = this.proximo.proximo;
		} else {
			this.proximo.remove(element);
		}
	}
	
	public int[] toArray() {
		int[] copia = new int[this.size()];
		toArray(copia, this, 0);
		return copia;
	}
	
	public void toArray (int[] copiar, ListaEncadeada no, int i) {
		if (! no.isEmpty()) {
			copiar[i] = no.data;
			toArray(copiar, no.proximo, i+1);
		}
	}
}
