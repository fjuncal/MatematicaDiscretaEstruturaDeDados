package com.br.assessmentLp.projeto4;

import java.util.ArrayList;

public class Recursividade {

    public static void main(String[] args) {
        int[] x = {0, 1, 2, 7, 9, 10, 7, 3, 7, 7, 7};
        int y = 7;
        int qtdVezesDoNumeroDentroDoArray = quantRepeticoesComRecursividade(0, y, x);
        System.out.println("No metodo COM recursividade o numero " + y + " apareceu " + qtdVezesDoNumeroDentroDoArray + " vezes");

        int contaSemRecursividade = contaArraySemRecursividade(x, y);
        System.out.println("No metodo SEM recursividade o numero " + y + " apareceu " + contaSemRecursividade + " vezes");
    }

    // método recursivo que recebe um valor
    public static int quantRepeticoesComRecursividade(int indice, int valor, int[] vetor) {
        if (indice == vetor.length - 1) { // indica que é o ultimo indice do vetor e que vai parar a recursividade
            if (vetor[indice] == valor) { //se for igual ao valor
                return 1; // mais uma repetição foi encontrada
            }
        } else { // dispara mais uma chamada recursiva
            if (vetor[indice] == valor) { // houve mais uma repetição
                return 1 + quantRepeticoesComRecursividade(indice + 1, valor, vetor);
            } else {
                return 0 + quantRepeticoesComRecursividade(indice + 1, valor, vetor); // não repetiu
            }
        }

        return 0; // nunca chega aqui
    }

    public static int contaArraySemRecursividade(int[] array, Object valorProcurado) {
        int contador = 0;
        if (array != null) {
            for (Object item : array) {
                if (item != null && item.equals(valorProcurado)) {
                    contador++;
                }
            }
        }
        return contador;
    }
}
