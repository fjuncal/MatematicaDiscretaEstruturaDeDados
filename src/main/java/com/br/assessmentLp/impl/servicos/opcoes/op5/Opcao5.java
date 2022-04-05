package com.br.assessmentLp.impl.servicos.opcoes.op5;

import java.util.Scanner;

import com.br.assessmentLp.impl.servicos.MenuPrincipal;

//[5]Solicita um ponto de entrega j�
//cadastrado e um caminh�o j� cadastrado e associa o local ao caminh�o. O local ser� o pr�ximo ponto da lista dos que ser� visitado pelo caminh�o;
public class Opcao5 {

	public static void opcao5Impl() {
		
		int opcao = Integer.MIN_VALUE;
		while (opcao != 0) {
			Scanner scanner = new Scanner(System.in);
			String menuItemDeEntrega = "----------------- \n"
					+ "ASSOCIAR PONTO DE ENTREGA A CAMINH�O: \n"
					+ "[1] - Associar ponto de entrega a caminh�o \n"
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
			System.out.println("Associar Ponto de Entrega a Caminh�o");
			break;
		case 7:
			MenuPrincipal.menu();
			break;
		case 0:
			System.exit(100);
			System.out.println("USUARIO SAIU DO SISTEMA");
			break;
		default:
			System.out.println("Insira uma op��o correta");
			break;
		}
		return opcao;
	}

}
