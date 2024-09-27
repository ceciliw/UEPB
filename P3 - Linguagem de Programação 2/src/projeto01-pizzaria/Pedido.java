package pizzaria;
import java.util.Scanner;

public class Pedido {
	public static void main(String args[]) {
		Scanner cliente = new Scanner(System.in);
		Itens clente = new Itens();

		int i, tamanho = 0, borda = 0, massa = 0, molho = 0, queijo = 0, carne = 0, acompanhamento = 0, finalizacao = 0;
		System.out.printf("Olá! Bem vindo a Ceci's Pizza!👩‍🍳🍕\nInforme seu nome para iniciar o atendimento\n");
		clente.todos[0][0] = cliente.nextLine();

		String tamanhos[] = new String[] { "Pequena (22cm): R$22,00", "Média (27cm): R$31,00 ",
				"Grande (35cm): R$47,00" };
		System.out.printf("\n%s, nos informe o tamanho da sua Pizza: ", clente.todos[0][0]);
		printar(tamanhos);
		tamanho = variavel(tamanho, 3);
		switch (tamanho) {
		case 1:
			clente.valor = 22;
			clente.todos[1][0] = "Pequena (22cm)";
			break;
		case 2:
			clente.valor = 31;
			clente.todos[1][0] = "Média (27cm)";
			break;
		case 3:
			clente.valor = 47;
			clente.todos[1][0] = "Grande (35cm)";
			break;
		default:
			break;
		}

		String massas[] = new String[]{"Tradicional", "Integral"};
		System.out.printf(
				"\n-----------------MASSA-------------------\nA massa dela será tradicional ou integral?\n(1- Tradicional / 2- Integral)");
		massa = variavel(massa, 2);
		ler(clente, massas, 2, 0, massa);

		String bordas[] = new String[] { "Cheddar", "Calabresa", "Muçarela", "Catupiry", "Requeijão", "Tradicional" };
		System.out.printf("\nComo deseja sua borda? ");
		printar(bordas);
		borda = variavel(borda, bordas.length);
		ler(clente, bordas, 3, 0, borda);

		String molhos[] = new String[] { "Tradicional", "Picante" };
		System.out.printf(
				"\n----------------RECHEIO------------------\nPrefere molho tradicional ou picante?\n(1- Tradicional / 2- picante)");
		molho = variavel(molho, 2);
		ler(clente, molhos, 0, 3, molho);

		String queijos[] = new String[] { "Cheddar", "Gorgonzola", "Muçarela", "Catupiry", "Parmesão", "Provolone",
				"Nenhum" };
		System.out.printf("\nEscolha até dois queijos: ");
		printar(queijos);
		for (i = 0; i <= 1; i++) {
			queijo = variavel(queijo, queijos.length);
			ler(clente, queijos, i, 1, queijo);
		}

		String carnes[] = new String[] { "Calabresa", "Bacon", "Frango", "Atum", "Camarão", "Carne de Sol", "Pepperoni",
				"Lombo", "Nenhum" };
		System.out.printf("\nEscolha até duas carnes: ");
		printar(carnes);
		for (i = 2; i <= 3; i++) {
			carne = variavel(carne, carnes.length);
			ler(clente, carnes, i, 1, carne);
		}

		String acompanhamentos[] = new String[] { "Azeitona", "Cebola", "Tomate", "Ovo", "Ervilha", "Milho",
				"Champignon", "Pimentão", "Brócolis", "Nenhum" };
		System.out.printf("\nSua pizza está quase pronta!\nSelecione até quatro acompanhamentos: ");
		printar(acompanhamentos);
		for (i = 0; i < 4; i++) {
			acompanhamento = variavel(acompanhamento, acompanhamentos.length);
			ler(clente, acompanhamentos, i, 2, acompanhamento);
		}

		String finalizacoes[] = new String[] { "Orégano", "Alho frito", "Pimenta", "Tomate seco", "Manjericão",
				"Nenhum", };
		System.out.printf("Por último, escolha três finalizações de seu gosto: ");
		printar(finalizacoes);
		for (i = 1; i <= 3; i++) {
			finalizacao = variavel(finalizacao, finalizacoes.length);
			ler(clente, finalizacoes, i, 3, finalizacao);
		}

		System.out.printf("\nSua pizza esta completa!\r\n"
				+ "----------------------------------------------------------\r\n"
				+ "                        CECI'S PIZZA                 \r\n"
				+ "----------------------------------------------------------\r\n"
				+ "              RESUMO DO PEDIDO DE %s            \r\n"
				+ "----------------------------------------------------------\r\n" 
				+ "🍕TAMANHO            %s\r\n"
				+ "🍕MASSA              %s\r\n" 
				+ "🍕BORDA              %s\r\n" 
				+ "🍕MOLHO              %s\r\n"
				+ "🍕QUEIJOS            / %s / %s /\r\n" 
				+ "🍕CARNES             / %s / %s /\r\n"
				+ "🍕ACOMPANHAMENTOS    / %s / %s / %s / %s /\r\n" 
				+ "🍕FINALIZAÇÕES       / %s / %s / %s /\r\n"
				+ "----------------------------------------------------------\r\n" 
				+ "🍕TOTAL:             R$%.2f\r\n\n"
				+ "%s, muito obrigado por escolher nossa pizzaria! Bom apetite!",
				clente.todos[0][0].toUpperCase(), clente.todos[1][0], clente.todos[2][0], clente.todos[3][0],
				clente.todos[0][3], clente.todos[0][1], clente.todos[1][1], clente.todos[2][1], clente.todos[3][1],
				clente.todos[0][2], clente.todos[1][2], clente.todos[2][2], clente.todos[3][2], clente.todos[1][3],
				clente.todos[2][3], clente.todos[3][3], clente.valor, clente.todos[0][0]);
	}

	public static void printar(String itens[]) {
		for (int i = 1; i <= itens.length; i++) {
			System.out.printf("\n%d- %s", i, itens[i - 1]);
		}
	}

	public static void ler(Itens variavel, String lista[], int posicao1, int posicao2, int var) {
		for (int i = 0; i < lista.length; i++) {
			if (var == (i + 1)) {
				variavel.todos[posicao1][posicao2] = lista[i];
			}
		}
		if (variavel.todos[posicao1][posicao2] == "Nenhum") {
			variavel.todos[posicao1][posicao2] = "";
		}
	}

	public static int variavel(int var, int tam) {
		Scanner usuario = new Scanner(System.in);
		var = usuario.nextInt();
		while (var < 1 || var > tam) {
			System.out.printf("Opção inválida, digite novamente: ");
			var = variavel(var, tam);
		}
		return var;
	}
}