package br.unipe.boaspraticas.exercicios.respostas.ocp.formas;


public class Retangulo implements AreaCalculavel {
    private double altura;
    private double largura;

    // Construtor, getters e setters omitidos

    @Override
    public double calcularArea() {
        return altura * largura;
    }
}