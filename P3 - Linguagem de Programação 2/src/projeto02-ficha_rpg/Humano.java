package ficha_rpg;

public class Humano extends Personagem {
	protected final String raca = "Humano";
	protected Tipo classe;
	protected Antecedente antecedente;
	
	public Humano () {}
	
	public Humano(String nome, int forca, int constituicao, int destreza, int carisma, int inteligencia, int sabedoria, Tipo classe, Antecedente antecedente) {
		super(nome, forca, constituicao, destreza, carisma, inteligencia, sabedoria);
		this.classe = classe;
		this.antecedente = antecedente;
	}
	
	public int gerar_forca () {
		forca = super.gerar_forca() + 1;
		return forca;
	}
	public int gerar_constituicao () {
		constituicao = super.gerar_constituicao() + 1;
		return constituicao;
	}
	public int gerar_destreza () {
		destreza = super.gerar_destreza() + 1;
		return destreza;
	}
	public int gerar_carisma () {
		carisma = super.gerar_carisma() + 1;
		return carisma;
	}
	public int gerar_inteligencia () {
		inteligencia = super.gerar_inteligencia() + 1;
		return inteligencia;
	}
	public int gerar_sabedoria () {
		sabedoria = super.gerar_sabedoria() + 1;
		return sabedoria;
	}
	
	public void ficha () {
		System.out.printf("Ficha do humano");
	}
	public void ficha (String nome) {
		System.out.printf("Ficha do humano %s",nome);
	}
	
	public void printar_ficha () {
		System.out.printf("\n------------------------\n        FICHA\n------------------------"
				+ "\n\nNome: "+nome
				+ "\n\nRaça: "+raca
				+ "\n\nHabilidades:"+super.toString()
				+ "\nClasse: "+classe.getNome()
				+"\n\nAntecedente: "+antecedente.getNome()
				+"\n\nItens iniciais: "+classe.getDescricao()+"\n"+antecedente.getDescricao());
	}
}
