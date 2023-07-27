package br.unipe.boaspraticas.exercicios.respostas.ocp.formas;


// Neste exemplo, temos uma classe CalculadoraDeArea que calcula a área total de um conjunto de
// formas geométricas. Porém, para adicionar uma nova forma geométrica, é necessário modificar a classe CalculadoraDeArea para lidar com o novo tipo, o que também viola o OCP.
// Classe que calcula a área total de um conjunto de formas geométricas
public class CalculadoraDeArea {
    public double calcularAreaTotal(AreaCalculavel[] formas) {
        double areaTotal = 0;
        for (AreaCalculavel forma : formas) {
            areaTotal += forma.calcularArea();
        }
        return areaTotal;
    }
}
