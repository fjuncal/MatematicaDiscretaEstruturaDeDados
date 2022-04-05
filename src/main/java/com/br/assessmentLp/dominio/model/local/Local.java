package com.br.assessmentLp.dominio.model.local;

import java.util.ArrayList;
import java.util.List;

import com.br.assessmentLp.dominio.model.entrega.ItemEntrega;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Local {

	private Long id;
	private String nome;
	private List<ItemEntrega> itensEntrega = new ArrayList<ItemEntrega>();
}
