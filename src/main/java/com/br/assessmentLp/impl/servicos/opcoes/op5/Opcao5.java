package com.br.assessmentLp.impl.servicos.opcoes.op5;

import java.util.*;
import java.util.stream.Collectors;

import com.br.assessmentLp.mock.CarregarCenariosMock;
import com.br.assessmentLp.dominio.model.caminhao.Caminhao;
import com.br.assessmentLp.dominio.model.entrega.ItemEntrega;
import com.br.assessmentLp.dominio.model.local.Local;
import com.br.assessmentLp.impl.servicos.MenuPrincipal;

//[5]Solicita um ponto de entrega já
//cadastrado e um caminhão já cadastrado e associa o local ao caminhão. O local será o próximo ponto da lista dos que será visitado pelo caminhão;
public class Opcao5 {

    public static void opcao5Impl() {

        int opcao = Integer.MIN_VALUE;
        while (opcao != 0) {
            Scanner scanner = new Scanner(System.in);
            String menuItemDeEntrega = "----------------- \n"
                    + "ASSOCIAR PONTO DE ENTREGA A CAMINHÃO: \n"
                    + "[1] - mostrar local de entrega a caminhão \n"
                    + "[2] - Alocar caminhão para Local sem \n"
                    + "[3] - Abastecer caminhão com os itens \n"
                    + "[7] - Voltar \n"
                    + "[0] - Sair";
            System.out.println(menuItemDeEntrega);
            try {
                opcao = funcionalidadesMenuOpcao5(scanner);

            } catch (Exception e) {
                System.out.println("Insira o caracter correto");
            }
        }

    }

    private static int funcionalidadesMenuOpcao5(Scanner scanner) {
        int opcao;
        opcao = scanner.nextInt();
        switch (opcao) {
            case 1:
                System.out.println(CarregarCenariosMock.getListaCaminhoes());
                break;
            case 2:
                analiseSemCaminhaoAlocado();
                break;
            case 3:
                alocandoItemNoCaminhao();
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

    private static void alocandoItemNoCaminhao() {
        List<Caminhao> listaCaminhoes = CarregarCenariosMock.getListaCaminhoes();
        Stack<ItemEntrega> adicionandoNoCaminhaoItem = new Stack<>();

        for (Caminhao caminhao : listaCaminhoes){
            Queue<Local> locais = caminhao.getLocais();
            for (Local local: locais){
                List<ItemEntrega> itensEntrega = local.getItensEntrega();
                adicionandoNoCaminhaoItem.addAll(itensEntrega);
            }
            System.out.println("Caminhão com a placa: " + caminhao.getPlaca()+ " abastecido com a carga");
            caminhao.setItensEntrega(adicionandoNoCaminhaoItem);
            adicionandoNoCaminhaoItem = new Stack<>();
        }
    }

    public static void analiseSemCaminhaoAlocado() {
        List<Local> listaLocaisSemCaminhaoAlocado = CarregarCenariosMock.getListaLocais().stream().filter(c -> c.getCaminhao() == null).collect(Collectors.toList());

        if (!listaLocaisSemCaminhaoAlocado.isEmpty()) {
            System.out.println("Locais sem caminhão alocado " + listaLocaisSemCaminhaoAlocado);
            for (Local local : listaLocaisSemCaminhaoAlocado) {
                Caminhao caminhao = CarregarCenariosMock.getListaCaminhoes().stream().min((c1, c2) -> {
                    return Integer.compare(c1.getLocais().size(), c2.getLocais().size());
                }).orElseThrow(NoSuchElementException::new);
                caminhao.addLocal(local);
                System.out.println("Foi alocado para o caminhão: " + caminhao.getPlaca());
            }
        }

    }

}
