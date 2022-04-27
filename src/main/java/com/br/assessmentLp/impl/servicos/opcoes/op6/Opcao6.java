package com.br.assessmentLp.impl.servicos.opcoes.op6;

import com.br.assessmentLp.mock.CarregarCenariosMock;
import com.br.assessmentLp.dominio.model.caminhao.Caminhao;
import com.br.assessmentLp.dominio.model.entrega.ItemEntrega;
import com.br.assessmentLp.dominio.model.local.Local;
import com.br.assessmentLp.impl.servicos.MenuPrincipal;

import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Opcao6 {

	public static void opcao6Impl() {
		int opcao = Integer.MIN_VALUE;
		while (opcao != 0) {
			Scanner scanner = new Scanner(System.in);
			String menuItemDeEntrega = "----------------- \n"
					+ "ASSOCIAR PONTO DE ENTREGA A CAMINHÃO: \n"
					+ "[1] - Realizar Entregas \n"
					+ "[7] - Voltar \n"
					+ "[0] - Sair";
			System.out.println(menuItemDeEntrega);
			try {
				opcao = funcionalidadesMenuOpcao6(scanner);

			} catch (Exception e) {
				System.out.println("Insira o caracter correto");
			}
		}
	}

	private static int funcionalidadesMenuOpcao6(Scanner scanner) {
		int opcao;
		opcao = scanner.nextInt();
		switch (opcao) {
			case 1:
				realizar();
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

	public static void realizar() {
		List<Caminhao> listaCaminhoes = CarregarCenariosMock.getListaCaminhoes();
		int totalItens = 0;
		int totalLocais = 0;
		for (Caminhao caminhao : listaCaminhoes){
			System.out.println("Percurso do Caminhao: " + caminhao.getPlaca());
			Queue<Local> localCaminhao = caminhao.getLocais();
			totalLocais = localCaminhao.size() + totalLocais;
			for (Local localEspecifico : localCaminhao){
				totalItens = localEspecifico.getItensEntrega().size() + totalItens;
				System.out.println("Visitando o local: " + localEspecifico.getNome());
				while (!localEspecifico.getItensEntrega().isEmpty()){
					System.out.println("Entregando o item: " + localEspecifico.getItensEntrega().pop().getNome());

				}
				System.out.println("-----");
			}
			System.out.println("O caminhao " + caminhao.getPlaca() + " entregou " + totalItens + " itens e fez entregas no total de " + totalLocais + " locais");
			totalItens = 0;
			totalLocais = 0;
			System.out.println("-------------------------");
		}
	}


}

