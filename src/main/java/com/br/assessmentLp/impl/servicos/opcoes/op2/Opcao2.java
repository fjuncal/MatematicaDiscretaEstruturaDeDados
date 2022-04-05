package com.br.assessmentLp.impl.servicos.opcoes.op2;

import java.util.Scanner;

import com.br.assessmentLp.impl.servicos.MenuPrincipal;

public class Opcao2 {

	public static void opcao2Impl() {
		int opcao = Integer.MIN_VALUE;
		while (opcao != 0) {
			Scanner scanner = new Scanner(System.in);
			String menuItemDeEntrega = "----------------- \n"
					+ "INSERIR ITEM DE ENTREGA: \n"
					+ "[1] - Criar item de Entrega \n"
					+ "[7] - Voltar \n"
					+ "[0] - Sair";
			System.out.println(menuItemDeEntrega);
			try {
				opcao = funcionalidadesMenuOpcao2(scanner);
				
			} catch (Exception e) {
				System.out.println("Insira o caracter correto");
			}
		}

	}

	private static int funcionalidadesMenuOpcao2(Scanner scanner) {
		int opcao;
		opcao = scanner.nextInt();
		switch (opcao) {
		case 1:
			System.out.println("Criar item de entrega");
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
