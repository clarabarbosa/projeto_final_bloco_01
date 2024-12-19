package floricultura;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import floricultura.controller.FloriculturaController;
import floricultura.model.Flores;
import floricultura.model.ProdutosFloricultura;

public class Menu {

	public static void main(String[] args) {
		
		FloriculturaController produtos = new FloriculturaController();
		
		Scanner leia = new Scanner (System.in);
		int id; String nome; int quantidade; String tipo; float valor; int validade; int estoqueVirtual;
		
		int opcao = 0; 
		
		
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
			
			try {
				opcao = leia.nextInt();
			}
			 catch(InputMismatchException e) {
				 System.out.println("\nDigite apenas números inteiros!");
				 leia.nextLine();
				 opcao = 0;
			 }
			
			if(opcao == 5) {
				System.out.println("Floricultura Manga Rosa - os melhores produtos para o seu jardim!");
				sobre();
				leia.close();
				System.exit(0);
			}
			
			switch(opcao) {
			case 1:  
				System.out.println("Cadastrar produtos");
				
				System.out.println("Digite o id do produto: ");
				id = leia.nextInt();
				System.out.println("Digite o nome produto: ");
				leia.skip("\\R?");
				nome = leia.nextLine();
				
				do { 
					System.out.println("Digite o tipo de produto:"
							+ "1 - Flores	"
							+ "2 - Plantas ornamentais"
							+ "3 - Produtos para o cultivo");
					leia.skip("\\R?");
					tipo = leia.nextLine();
					}
				while(tipo < 1 && > 3 );
				
			   System.out.println("Digite o valor do produto: ");
			   valor = leia.nextFloat();
			   
			   switch(tipo) {
			   case 1 -> System.out.println("Digite a quantidade do produto: ");
			   estoqueVirtual = leia.nextInt(); }
			   produtos.cadastrar();
			}
				KeyPress();
				break;
				
			case 2:
				System.out.println("Listar produtos");
				produtos.listar();
				
				KeyPress();
				break;
			case 3:
				System.out.println("Atualizar dados dos produtos");
				KeyPress();
			
				break;
			case 4:
				System.out.println("Excluir produtos");
				KeyPress();
			
				break;
			default:
				System.out.println("\nOpcão Inválida!");
				KeyPress();
				break;
			}
		
	}
	public static void KeyPress() {
		try {
			System.out.println("\nPressione ENTER para continuar ");
			System.in.read();
			
		}catch (IOException e) {
			System.out.println("\nVocê pressionou uma tecla diferente de ENTER");
		}
	}
	
	private static void sobre() {
		}
		}


