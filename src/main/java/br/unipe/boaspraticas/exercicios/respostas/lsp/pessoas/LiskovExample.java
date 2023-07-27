package br.unipe.boaspraticas.exercicios.respostas.lsp.pessoas;

public class LiskovExample {
    public static void main(String[] args) {
        // Usando polimorfismo com a referência da classe base (Pessoa)
        Pessoa pessoa = new Funcionario("João", 3000);
        pessoa.fazerSom(); // Oi!

        // A referência da classe derivada (Funcionario) não sobrescreve o método fazerSom(),
        // mantendo o comportamento original herdado da classe base.
        Funcionario funcionario = new Funcionario("Maria", 4000);
        funcionario.fazerSom(); // Oi!

        // Agora o comportamento é consistente entre as duas referências, respeitando o LSP.
    }
}
