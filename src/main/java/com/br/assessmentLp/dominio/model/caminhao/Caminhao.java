package com.br.assessmentLp.dominio.model.caminhao;

import java.util.*;

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
	private Queue<Local> locais = new LinkedList<>();
	private Stack<ItemEntrega> itensEntrega = new Stack<ItemEntrega>();

	@Override
	public String toString() {
		return "Caminhao - " +
				"placa='" + placa + '\'' +
				", locais=" + locais +
				", itensEntrega=" + itensEntrega +
				"}\n";
	}

	public void addLocal(Local local){
		locais.add(local);
		local.setCaminhao(this);
	}

	public void addItemEntrega(ItemEntrega itemEntrega){
		itensEntrega.add(itemEntrega);
	}
}
