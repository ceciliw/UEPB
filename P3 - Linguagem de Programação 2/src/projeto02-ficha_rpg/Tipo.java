package ficha_rpg;
import java.util.Scanner;

public class Tipo {
	private String nome;
	private String descricao;
	
	public Tipo () {}
	
	public Tipo(String nome, String descricao) {
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
		Scanner sc = new Scanner(System.in);
		
		String[] tipos = {"\n-um machado grande\n-dois machados de mão\n-uma pacote de aventureiro\n-quatro azagaias",""
				+ "\n-um bordão\n-uma bolsa de componentes\n-um pacote de estudioso\n-um grimório",""
				+ "\n-uma rapieira\n-um arco curto\n-uma aljava com 20 flechas\n-um pacote de assaltante\n-uma armadura de couro\n-duas adagas\n-ferramentas de ladrão",""
				+ "\n-uma arma marcial\n-um escudo\n-cinco azagaias\n-um pacote de sacerdote\n-cota de malha\n-um símbolo sagrado"};
		
		System.out.println("\nEscolha sua classe: \n1- Bárbaro\n2- Mago\n3- Ladino\n4- Paladino");
		String selecione = sc.nextLine();
		
		switch (selecione) {
		case "1":
			nome = "Bábaro";
			descricao = tipos[0];
			break;
		case "2":
			nome = "Mago";
			descricao = tipos[1];
			break;
		case "3":
			nome = "Ladino";
			descricao = tipos[2];
			break;
		case "4":
			nome = "Paladino";
			descricao = tipos[3];
			break;
		default:
			System.out.println("Invalido");
			System.exit(0);
			break;
		}
	}
}
