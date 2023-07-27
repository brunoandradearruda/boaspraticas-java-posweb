package br.unipe.boaspraticas.exercicios.respostas.ocp.formas;

import br.unipe.boaspraticas.exercicios.respostas.model.Compra;
import br.unipe.boaspraticas.exercicios.respostas.model.ItemCompra;

// Classe responsável por calcular o valor total de uma compra
public class CalculadoraDeCompra {
    public double calcularTotal(Compra compra) {
        double total = 0;
        for (ItemCompra item : compra.getItens()) {
            total += item.getQuantidadeItens() * item.getQuantidadeItens();
        }
        if (compra.getDesconto() > 0) {
            total -= total * (compra.getDesconto() / 100);
        }
        return total;
    }
}


