package com.br.assessmentLp.dominio.model.entrega;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ItemEntrega {

	private String id;
	private String nome;

	@Override
	public String toString() {
		return "ItemEntrega{" +
				"nome='" + nome +
				"}";
	}
}
