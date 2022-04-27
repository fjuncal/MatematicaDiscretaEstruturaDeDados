package com.br.assessmentLp;

import com.br.assessmentLp.mock.CarregarCenariosMock;
import com.br.assessmentLp.impl.servicos.MenuPrincipal;

public class AssessmentApplication {

	public static void main(String[] args) {
		CarregarCenariosMock.carregarCenarioInicial();
		MenuPrincipal.menu();
	}


}
