package ficha_rpg;

public class Elfo extends Personagem {
	protected final String raca = "Elfo";
	protected Tipo classe;
	protected Antecedente antecedente;
	
	public Elfo () {}
	
	public Elfo(String nome, int forca, int constituicao, int destreza, int carisma, int inteligencia, int sabedoria, Tipo classe, Antecedente antecedente) {
		super(nome, forca, constituicao, destreza, carisma, inteligencia, sabedoria);
		this.classe = classe;
		this.antecedente = antecedente;
	}
	
	public int gerar_destreza () {
		forca = super.gerar_destreza() + 2;
		return forca;
	}
	public int gerar_carisma () {
		carisma = super.gerar_carisma() + 2;
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
