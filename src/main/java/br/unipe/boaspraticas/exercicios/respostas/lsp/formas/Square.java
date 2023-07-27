package br.unipe.boaspraticas.exercicios.respostas.lsp.formas;

class Square implements ShapeInterface {
    private int side;

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public void draw() {
        // Desenhar um quadrado
    }

    @Override
    public int getArea() {
        return side * side;
    }
}