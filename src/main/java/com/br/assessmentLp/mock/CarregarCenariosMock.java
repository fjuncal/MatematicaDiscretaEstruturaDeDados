package com.br.assessmentLp.mock;

import com.br.assessmentLp.dominio.model.caminhao.Caminhao;
import com.br.assessmentLp.dominio.model.entrega.ItemEntrega;
import com.br.assessmentLp.dominio.model.local.Local;

import java.util.*;


public class CarregarCenariosMock {

    private static List<Caminhao> listaCaminhoes;
    private static Queue<Local> listaLocais;
    private static Stack<ItemEntrega> listaItensEntrega;

    public static void carregarCenarioInicial() {
        listaCaminhoes = new ArrayList<>();
        listaLocais = new LinkedList<>();
        listaItensEntrega = new Stack<>();

        //Caminhao caminhao1 = criarInstaciaCaminhao("abc-123");
        Caminhao caminhao1 = criarInstaciaCaminhao("1");
        Caminhao caminhao2 = criarInstaciaCaminhao("2");
        //Caminhao caminhao4 = criarInstaciaCaminhao("klm-221");


        Local localA = criarInstanciaLocal("Loja A");
        //Local local12 = criarInstanciaLocal("Loja B");
        //Local local13 = criarInstanciaLocal("Loja C");
        Local localD = criarInstanciaLocal("Loja D");
        Local localE = criarInstanciaLocal("Loja E");
        Local localF = criarInstanciaLocal("Loja F");
        //Local local41 = criarInstanciaLocal("Loja G");
        //Local localH = criarInstanciaLocal("Loja H");
        //Local local43 = criarInstanciaLocal("Loja I");
        //Local local44 = criarInstanciaLocal("Loja J");
        Local local99 = criarInstanciaLocal("Loja X");

        ItemEntrega itemEntregaBebidas = criarInstaciaItemEntrega("Bebidas");
        ItemEntrega itemEntregaCamisas = criarInstaciaItemEntrega("Camisas");
        ItemEntrega itemEntregaMaterialEscolar = criarInstaciaItemEntrega("Material Escolar");
        ItemEntrega itemEntregaMoveis = criarInstaciaItemEntrega("Moveis");
        ItemEntrega itemEntregaPerifericos = criarInstaciaItemEntrega("Perifericos");

        //caminhao1.addLocal(local11);
        //caminhao1.addLocal(local12);
        //caminhao1.addLocal(local13);

        caminhao1.addLocal(localF);
        caminhao1.addLocal(localD);
        caminhao1.addLocal(localE);

        caminhao2.addLocal(localA);

        localF.addItemEntrega(itemEntregaCamisas);
        localF.addItemEntrega(itemEntregaPerifericos);
        localF.addItemEntrega(itemEntregaBebidas);

        localD.addItemEntrega(itemEntregaPerifericos);

        localE.addItemEntrega(itemEntregaMoveis);
        localE.addItemEntrega(itemEntregaMaterialEscolar);
        localE.addItemEntrega(itemEntregaCamisas);
        localE.addItemEntrega(itemEntregaBebidas);
        localE.addItemEntrega(itemEntregaBebidas);

        localA.addItemEntrega(itemEntregaBebidas);
        localA.addItemEntrega(itemEntregaMaterialEscolar);

        //caminhao4.addLocal(local41);
        //caminhao4.addLocal(localH);
        //caminhao4.addLocal(local43);
        //caminhao4.addLocal(local44);





        //local12.addItemEntrega(itemEntrega2);
       // local13.addItemEntrega(itemEntrega4);
        //local21.addItemEntrega(itemEntrega1);

       // local22.addItemEntrega(itemEntrega2);

        //local31.addItemEntrega(itemEntrega1);
       // local31.addItemEntrega(itemEntrega4);
        //local41.addItemEntrega(itemEntrega5);
        //local41.addItemEntrega(itemEntrega3);
        //localH.addItemEntrega(itemEntregaBebidas);
       // local43.addItemEntrega(itemEntrega4);
        //local44.addItemEntrega(itemEntrega5);
        //local44.addItemEntrega(itemEntrega2);
        local99.addItemEntrega(itemEntregaBebidas);
    }

    private static Local criarInstanciaLocal(String nome) {
        Local local = new Local(UUID.randomUUID().toString(), nome, new Stack<>(), null);
        listaLocais.add(local);
        return local;
    }

    private static Caminhao criarInstaciaCaminhao(String placa) {
        Caminhao caminhao = new Caminhao(placa, new LinkedList<>(), new Stack<>());
        listaCaminhoes.add(caminhao);
        return caminhao;
    }

    private static ItemEntrega criarInstaciaItemEntrega(String nome) {
        ItemEntrega itemEntrega = new ItemEntrega(UUID.randomUUID().toString(), nome);
        listaItensEntrega.push(itemEntrega);
        return itemEntrega;
    }

    public static List<Caminhao> getListaCaminhoes() {
        return listaCaminhoes;
    }

    public static Queue<Local> getListaLocais() {
        return listaLocais;
    }

    public static Stack<ItemEntrega> getListaItensEntrega() {
        return listaItensEntrega;
    }
}
