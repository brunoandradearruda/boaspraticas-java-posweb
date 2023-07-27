package br.unipe.boaspraticas.exercicios.respostas.lsp.pessoas;

class Pessoa {
    private String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void fazerSom() {
        System.out.println("Oi!");
    }
}