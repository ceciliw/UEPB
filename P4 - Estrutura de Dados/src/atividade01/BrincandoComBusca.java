package atividade01;

public class BrincandoComBusca {

	public static void main(String[] args) {
		
		Busca_IF b = new Busca();
		final int numeroParaBuscar = -1; 
		
		final int[] vetor1000 = b.geraVetorNumericoOrdenado(1000);
		long antes, depois;
		
		long somalinit = 0;
		for (int i = 0; i < 50; i++) {
		antes = System.nanoTime();
		b.buscaLinear_iterativa(vetor1000, numeroParaBuscar);
		depois = System.nanoTime();
		//System.out.println("buscaLinear_iterativa:\t"+(depois-antes));
		
		
		/*antes = System.nanoTime();
		b.buscaLinear_iterativa_duasPontas(vetor1000, numeroParaBuscar);
		depois = System.nanoTime();
		//System.out.println("buscaLinear_iterativa2:\t"+(depois-antes));
		
		antes = System.nanoTime();
		b.buscaLinear_recursiva(vetor1000, numeroParaBuscar);
		depois = System.nanoTime();
		//System.out.println("buscaLinear_recursiva:\t"+(depois-antes));
		
		antes = System.nanoTime();
		b.buscaBinaria_iterativa(vetor1000, numeroParaBuscar);
		depois = System.nanoTime();
		//System.out.println("buscaBinaria_iterativa:\t"+(depois-antes));
		
		antes = System.nanoTime();
		b.buscaBinaria_recursiva(vetor1000, numeroParaBuscar);
		depois = System.nanoTime();
		//System.out.println("buscaBinaria_recursiva:\t"+(depois-antes));*/
		somalinit += (depois-antes);
		}
		double media = somalinit / 50;
		System.out.println(media);
		
	}
}
