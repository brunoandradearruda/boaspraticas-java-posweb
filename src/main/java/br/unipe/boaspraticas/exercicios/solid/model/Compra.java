package br.unipe.boaspraticas.exercicios.solid.model;

import lombok.Data;

import java.util.List;

@Data
public class Compra {
    private List<ItemCompra> itemLista;   //Lista de itens
    private double descontoAplicado; //desconto a ser aplicado

    // getters e setters omitidos
}
