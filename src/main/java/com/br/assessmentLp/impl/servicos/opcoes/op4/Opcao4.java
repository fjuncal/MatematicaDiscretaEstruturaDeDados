package com.br.assessmentLp.impl.servicos.opcoes.op4;

import java.util.Scanner;

import com.br.assessmentLp.impl.servicos.MenuPrincipal;

//[4]Solicita um item de entrega já cadastrado e um local já cadastrado, e associa o item ao local;
public class Opcao4 {

	public static void opcao4Impl() {

		int opcao = Integer.MIN_VALUE;
		while (opcao != 0) {
			Scanner scanner = new Scanner(System.in);
			String menuItemDeEntrega = "----------------- \n"
					+ "ASSOCIAR ITEM A PONTO DE ENTREGA: \n"
					+ "[1] - Associar item ao ponto de entrega \n"
					+ "[2] - Remover item da lista de entrega \n"
					+ "[3] - Consultar um item da lista de entrega \n"
					+ "[7] - Voltar \n"
					+ "[0] - Sair";
			System.out.println(menuItemDeEntrega);
			try {
				opcao = funcionalidadesMenuOpcao4(scanner);
				
			} catch (Exception e) {
				System.out.println("Insira o caracter correto");
			}
		}
	}

	private static int funcionalidadesMenuOpcao4(Scanner scanner) {
		int opcao;
		opcao = scanner.nextInt();
		switch (opcao) {
		case 1:
			System.out.println("Associar item ao ponto de entrega");
			break;
		case 2:
			System.out.println("Remover item da lista de entrega");
			break;
		case 3:
			System.out.println("Consultar um item da lista de entrega");
			break;
		case 7:
			MenuPrincipal.menu();
			break;
		case 0:
			System.exit(100);
			System.out.println("USUARIO SAIU DO SISTEMA");
			break;
		default:
			System.out.println("Insira uma opção correta");
			break;
		}
		return opcao;
	}

}
