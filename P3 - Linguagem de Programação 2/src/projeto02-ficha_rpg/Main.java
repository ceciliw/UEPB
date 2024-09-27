package ficha_rpg;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws InterruptedException {
		Scanner jogador = new Scanner(System.in);
		
		Tipo a = new Tipo();
		Antecedente b = new Antecedente();
		
		System.out.printf("⚔ Olá aventureiro! Bem vindo ao nosso gerador de fichas!\n");
		Thread.sleep(2000);
		System.out.printf("\nInsira os dados de seu novo personagem:\nQual será sua raça?  \n1- Humano\n2- Elfo\n3- Meio-orc\n");
		String raca = jogador.nextLine();
		
		switch (raca) {
		case "1":
			Humano human = new Humano();
			System.out.printf("Qual o nome do seu personagem? ");
			human.nome = jogador.nextLine();
			
			rolando_dados();
			human.gerar_forca();
			human.gerar_constituicao();
			human.gerar_destreza();
			human.gerar_carisma();
			human.gerar_inteligencia();
			human.gerar_sabedoria();
			
			System.out.printf("\nSeus atributos são:"+human);
			Thread.sleep(2000);
			
			pedir_itens(a,b);
			human.classe = a;
			human.antecedente = b;
			
			human.printar_ficha();
			
			break;
		case "2":
			Elfo elf = new Elfo();
			System.out.printf("Qual o nome do seu personagem? ");
			elf.nome = jogador.nextLine();
			
			rolando_dados();
			elf.gerar_forca();
			elf.gerar_constituicao();
			elf.gerar_destreza();
			elf.gerar_carisma();
			elf.gerar_inteligencia();
			elf.gerar_sabedoria();
			
			System.out.printf("\nSeus atributos são:"+elf);
			Thread.sleep(2000);
			
			pedir_itens(a,b);
			elf.classe = a;
			elf.antecedente = b;
			
			elf.printar_ficha();
			
			break;
		case "3":
			Meio_orc orc = new Meio_orc();
			System.out.printf("Qual o nome do seu personagem? ");
			
			orc.nome = jogador.nextLine();
			
			rolando_dados();
			orc.gerar_forca();
			orc.gerar_constituicao();
			orc.gerar_destreza();
			orc.gerar_carisma();
			orc.gerar_inteligencia();
			orc.gerar_sabedoria();
			
			System.out.printf("\nSeus atributos são:"+orc);
			Thread.sleep(2000);
			
			pedir_itens(a,b);
			orc.classe = a;
			orc.antecedente = b;
			
			orc.printar_ficha();
			
			break;
		default:
			System.out.println("Invalido");
			break;
		}
	}
	
	public static void pedir_itens(Tipo v1,Antecedente v2) {
		v1.gerar_itens();
		v2.gerar_itens();
	}
	
	public static void rolando_dados () throws InterruptedException {
		System.out.println("\n🎲Rolando os dados...");
		Thread.sleep(3000);
	}
}