package ficha_rpg;

public class Meio_orc extends Personagem {
	protected final String raca = "Meio-orc";
	protected Tipo classe;
	protected Antecedente antecedente;
	
	public Meio_orc () {}
	
	public Meio_orc(String nome, int forca, int constituicao, int destreza, int carisma, int inteligencia, int sabedoria, Tipo classe, Antecedente antecedente) {
		super(nome, forca, constituicao, destreza, carisma, inteligencia, sabedoria);
		this.classe = classe;
		this.antecedente = antecedente;
	}

	public int gerar_forca () {
		forca = super.gerar_forca() + 2;
		return forca;
	}
	public int gerar_constituicao () {
		constituicao = super.gerar_constituicao() + 1;
		return constituicao;
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
