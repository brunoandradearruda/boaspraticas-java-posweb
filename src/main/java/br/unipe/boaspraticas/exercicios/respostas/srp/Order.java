package br.unipe.boaspraticas.exercicios.respostas.srp;
import br.unipe.boaspraticas.exercicios.respostas.model.Item;

import java.util.List;


public class Order {
    private int orderId;
    private String customerName;
    private List<Item> items;

    public Order(int orderId, String customerName, List<Item> items) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.items = items;
    }

    public double calculateTotalPrice() {
        double total = 0;
        for (Item item : items) {
            total += item.getPrecoItem();
        }
        return total;
    }
}

