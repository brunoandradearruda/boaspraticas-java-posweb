package br.unipe.boaspraticas.exercicios.solid.model;


import lombok.Data;

@Data
public class ItemCompra {
    private String n;  //NOME da pessoa realizando compra

    private double p; //Preço da compra
    private int qtd;  // Quantidade de itens

}
