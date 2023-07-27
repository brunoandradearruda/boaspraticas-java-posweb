package br.unipe.boaspraticas.exercicios.respostas.ocp.formas;


public class Circulo implements AreaCalculavel {
    private double raio;

    // Construtor, getters e setters omitidos
    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;
    }
}