package floricultura;
import floricultura.model.Floricultura;
import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		int opcao;
		
		
		while (true) {
			System.out.println("************************************************");
			System.out.println("        FLORICULTURA MANGA ROSA                 ");
			System.out.println("************************************************");
			System.out.println("        1 - Cadastrar produtos                  ");
			System.out.println("        2 - Listar produtos                     ");
			System.out.println("        3 - Atualizar dados dos produtos        ");
			System.out.println("        4 - Excluir produtos                    ");
			System.out.println("        5 - Sair                                ");
			System.out.println("************************************************");
			System.out.println("Digite a opção desejada:                        ");
			System.out.println("                                                ");
			System.out.println("************************************************");
			
			opcao = leia.nextInt();
			
			if(opcao == 5) {
				System.out.println("Floricultura Manga Rosa - os melhores produtos para o seu jardim!");
				sobre();
				leia.close();
				System.exit(0);
			}
			
			switch(opcao) {
			case 1 -> System.out.println("Cadastrar produtos");
			
			case 2 -> System.out.println("Listar produtos");
			
			case 3 -> System.out.println("Atualizar dados dos produtos");
			
			case 4 -> System.out.println("Excluir produtos");
			
			default -> System.out.println("\nOpcão Inválida!");
			
			}
		}
			
		

	}

	private static void sobre() {

		
	}

}
