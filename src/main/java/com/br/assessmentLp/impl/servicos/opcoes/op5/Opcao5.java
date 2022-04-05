package com.br.assessmentLp.impl.servicos.opcoes.op5;

import java.util.Scanner;

import com.br.assessmentLp.impl.servicos.MenuPrincipal;

//[5]Solicita um ponto de entrega já
//cadastrado e um caminhão já cadastrado e associa o local ao caminhão. O local será o próximo ponto da lista dos que será visitado pelo caminhão;
public class Opcao5 {

	public static void opcao5Impl() {
		
		int opcao = Integer.MIN_VALUE;
		while (opcao != 0) {
			Scanner scanner = new Scanner(System.in);
			String menuItemDeEntrega = "----------------- \n"
					+ "ASSOCIAR PONTO DE ENTREGA A CAMINHÃO: \n"
					+ "[1] - Associar ponto de entrega a caminhão \n"
					+ "[7] - Voltar \n"
					+ "[0] - Sair";
			System.out.println(menuItemDeEntrega);
			try {
				opcao = funcionalidadesMenuOpcao5(scanner);
				
			} catch (Exception e) {
				System.out.println("Insira o caracter correto");
			}
		}
		
	}

	private static int funcionalidadesMenuOpcao5(Scanner scanner) {
		int opcao;
		opcao = scanner.nextInt();
		switch (opcao) {
		case 1:
			System.out.println("Associar Ponto de Entrega a Caminhão");
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
