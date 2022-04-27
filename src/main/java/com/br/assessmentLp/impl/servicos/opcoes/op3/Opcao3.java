package com.br.assessmentLp.impl.servicos.opcoes.op3;

import java.util.Scanner;

import com.br.assessmentLp.mock.CarregarCenariosMock;
import com.br.assessmentLp.impl.servicos.MenuPrincipal;

public class Opcao3 {

	//static List<Caminhao> listaCaminhoes = new ArrayList<>();

	public static void opcao3Impl() {
		int opcao = Integer.MIN_VALUE;
		while (opcao != 0) {
			Scanner scanner = new Scanner(System.in);
			String menuInserirCaminhao = "----------------- \n"
					+ "ADICIONAR CAMINH�ES: \n"
					//+ "[1] - Inserir caminh�o \n"
					//+ "[2] - Remover caminh�o \n"
					+ "[1] - Consultar um caminh�o, listando seus pontos de entrega e itens a serem entregues por ponto de entrega \n"
					+ "[7] - Voltar \n"
					+ "[0] - Sair";
			System.out.println(menuInserirCaminhao);
			try {
				opcao = funcionalidadesMenuOpcao3(scanner);
				
			} catch (Exception e) {
				System.out.println("Insira o caracter correto");
			}
		}		
	}

	private static int funcionalidadesMenuOpcao3(Scanner scanner) {
		int opcao;
		opcao = scanner.nextInt();
		switch (opcao) {
		case 1:
			System.out.println(CarregarCenariosMock.getListaCaminhoes());
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
