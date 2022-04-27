package com.br.assessmentLp.impl.servicos.opcoes.op1;

import java.util.Scanner;

import com.br.assessmentLp.mock.CarregarCenariosMock;
import com.br.assessmentLp.impl.servicos.MenuPrincipal;

public class Opcao1 {

	//static List<Local> listaLocal = new ArrayList<>();

	@SuppressWarnings({ "resource" })
	public static void opcao1Impl() {
		int opcao = Integer.MIN_VALUE;
		while (opcao != 0) {
			Scanner scanner = new Scanner(System.in);
			String menuPontoDeEntrega = "----------------- \n"
					+ "INSERIR PONTO DE ENTREGA: \n"
//					+ "[1] - Inserir ponto de entrega \n"
					+ "[1] - Mostrar pontos de entrega criados \n"
					+ "[7] - Voltar \n"
					+ "[0] - Sair";
			System.out.println(menuPontoDeEntrega);
			try {
				opcao = funcionalidadesMenuOpcao1(scanner);
				
			} catch (Exception e) {
				System.out.println("Insira o caracter correto");
			}
		}
	}

	private static int funcionalidadesMenuOpcao1(Scanner scanner) {
		int opcao;
		opcao = scanner.nextInt();
		switch (opcao) {
			case 1:
				System.out.println(CarregarCenariosMock.getListaLocais());
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
