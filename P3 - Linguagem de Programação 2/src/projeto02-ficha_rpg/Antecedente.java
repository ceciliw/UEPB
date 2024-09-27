package ficha_rpg;
import java.util.Scanner;

public class Antecedente {
	private String nome;
	private String descricao;
	
	public Antecedente() {}
	
	public Antecedente(String nome, String descricao) {
		this.nome = nome;
		this.descricao = descricao;
	}
	
	public void setNome (String nome) {
		this.nome = nome;
	}
	public String getNome () {
		return nome;
	}
	public void setDescricao (String descricao) {
		this.descricao = descricao;
	}
	public String getDescricao () {
		return descricao;
	}
	
	public void gerar_itens () {
		Scanner sc = new Scanner (System.in);
		
		String[] ancestrais = {"-um pé de cabra\n-um conjunto de roupas escuras comuns com capuz\n-uma algibeira contendo 15 po (pontos de ouro)",""
				+ "-um conjunto de trajes finos\n-um anel de sinete\n-um pergaminho de linhagem\n-uma algibeira contendo 25 po (pomtos de ouro)",""
				+ "-um vidro de tinta escura\n-uma pena\n-uma faca pequena\n-uma carta de um falecido colega perguntando a você algo que você nunca terá a chance de responder\n-um conjunto de roupas comuns\n-uma algibeira contendo 10 po (pontos de ouro)",""
				+ "-uma faca pequena\n-um mapa da cidade em que você cresceu\n-um rato de estimação\n-um pequeno objeto para lembrar dos seus pais\n-um conjunto de roupas comuns\n-uma algibeira contendo 10 po (pontos de ouro)"};
		
		System.out.println("\nEscolha seu antecedente: \n1- Criminoso\n2- Nobre\n3- Sábio\n4- Ófão");
		String ancestra = sc.nextLine();
		
		switch (ancestra) {
		case "1":
			nome = "Criminoso";
			descricao = ancestrais[0];
			break;
		case "2":
			nome = "Nobre";
			descricao = ancestrais[1];
			break;
		case "3":
			nome = "Sábio";
			descricao = ancestrais[2];
			break;
		case "4":
			nome = "Órfão";
			descricao = ancestrais[3];
			break;
		default:
			System.out.println("Invalido");
			System.exit(0);
			break;
		}
	}
}
