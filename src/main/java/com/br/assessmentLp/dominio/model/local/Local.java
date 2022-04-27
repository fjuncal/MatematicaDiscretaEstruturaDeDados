package com.br.assessmentLp.dominio.model.local;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.UUID;

import com.br.assessmentLp.dominio.model.caminhao.Caminhao;
import com.br.assessmentLp.dominio.model.entrega.ItemEntrega;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Local {

    private String id;
    private String nome;
    private Stack<ItemEntrega> itensEntrega = new Stack<ItemEntrega>();
    private Caminhao caminhao;

    @Override
    public String toString() {
        return "Local{" +
                "nome='" + nome + '\'' +
                ", itensEntrega=" + itensEntrega +
                "} \n";
    }

    public void addItemEntrega(ItemEntrega itemEntrega) {
        itensEntrega.add(itemEntrega);
    }
}
