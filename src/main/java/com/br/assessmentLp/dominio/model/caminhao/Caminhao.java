package com.br.assessmentLp.dominio.model.caminhao;

import java.util.ArrayList;
import java.util.List;

import com.br.assessmentLp.dominio.model.entrega.ItemEntrega;
import com.br.assessmentLp.dominio.model.local.Local;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Caminhao {

	private String placa;
	private List<Local> locais = new ArrayList<Local>();
	private List<ItemEntrega> itensEntrega = new ArrayList<ItemEntrega>();

}
