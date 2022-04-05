package com.br.assessmentLp.impl.servicos;

import java.util.Scanner;

import com.br.assessmentLp.impl.servicos.opcoes.op1.Opcao1;
import com.br.assessmentLp.impl.servicos.opcoes.op2.Opcao2;
import com.br.assessmentLp.impl.servicos.opcoes.op3.Opcao3;
import com.br.assessmentLp.impl.servicos.opcoes.op4.Opcao4;
import com.br.assessmentLp.impl.servicos.opcoes.op5.Opcao5;
import com.br.assessmentLp.impl.servicos.opcoes.op6.Opcao6;

public class MenuPrincipal {
	
	@SuppressWarnings("resource")
	public static void menu() {
		int opcao = Integer.MIN_VALUE;
		while (opcao != 0) {
			Scanner scanner = new Scanner(System.in);
			String menu = "--------------------------- \n"
					+ "BEM VINDO AO SISTEMA DE ENTEGA: \n"
					+ "ESCOLHA UMA OPÇÃO: \n"
					+ "[1] - Inserir ponto de entrega \n"
					+ "[2] - Inserir item de entrega \n"
					+ "[3] - Inserir caminhão \n"
					+ "[4] - Associar item a ponto de entrega \n"
					+ "[5] - Associar ponto de entrega a caminhão \n"
					+ "[6] - Realizar entregas \n"
					+ "[0] - SAIR \n"
					+ "--------------------------- ";
			System.out.println(menu);
			try {
				opcao = funcionalidadesMenuPrincipal(scanner);
			} catch (Exception e) {
				System.out.println("Insira o caracter correto");
			}

		}
	}

	private static int funcionalidadesMenuPrincipal(Scanner scanner) {
		int opcao;
		opcao = scanner.nextInt();
		switch (opcao) {
		case 1:
			Opcao1.opcao1Impl();
			break;
		case 2:
			Opcao2.opcao2Impl();
			break;
		case 3:
			Opcao3.opcao3Impl();
			break;
		case 4:
			Opcao4.opcao4Impl();
			break;
		case 5:
			Opcao5.opcao5Impl();
			break;
		case 6:
			Opcao6.opcao6Impl();
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
