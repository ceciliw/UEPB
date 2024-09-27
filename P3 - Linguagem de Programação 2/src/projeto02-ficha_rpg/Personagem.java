package ficha_rpg;
import java.util.Arrays;
import java.util.Random;

public class Personagem {
	protected String nome;
	protected int forca, constituicao, destreza, carisma, inteligencia, sabedoria;
	
	public Personagem () {}
	
	public Personagem(String nome, int forca, int constituicao, int destreza, int carisma, int inteligencia, int sabedoria) {
		super();
		this.nome = nome;
		this.forca = forca;
		this.constituicao = constituicao;
		this.destreza = destreza;
		this.carisma = carisma;
		this.inteligencia =inteligencia;
		this.sabedoria = sabedoria;
	}
	
	public int gerar_forca () {
		forca = gerar_atributo(forca);
		return forca;
	}
	public int gerar_constituicao () {
		constituicao = gerar_atributo(constituicao);
		return constituicao;
	}
	public int gerar_destreza () {
		destreza = gerar_atributo(destreza);
		return destreza;
	}
	public int gerar_carisma () {
		carisma = gerar_atributo(carisma);
		return carisma;
	}
	public int gerar_inteligencia () {
		inteligencia = gerar_atributo(inteligencia);
		return inteligencia;
	}
	public int gerar_sabedoria () {
		sabedoria = gerar_atributo(sabedoria);
		return sabedoria;
	}
	
	@Override
	public String toString () {
		return "\n-Força: "+forca+"\n-Constituição: "+constituicao+"\n-Destreza: "+destreza+"\n-Carisma: "+carisma+"\n-Inteligencia: "+inteligencia+"\n-Sabedoria: "+sabedoria+"\n";
	}
	
	public void ficha () {
		System.out.printf("Ficha do personagem");
	}
	
	public static int gerar_atributo (int atributo) {
		Random escolha = new Random();
		int[] lista = new int[4];
		for (int i = 0; i < 4; i++) {
            lista[i] = escolha.nextInt(1,7);
            //System.out.print(lista[i]+" ");
        }
		Arrays.sort(lista);
		atributo = lista[1] + lista[2] + lista[3];
		return atributo;
	}
}
