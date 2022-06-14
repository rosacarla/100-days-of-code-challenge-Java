package projeto.colab;

public class Gerente extends Colaborador {
    public Gerente(String nome, int idade, double salario, int grauInstrucao) {
        super(nome, idade, salario, grauInstrucao);
    }

    @Override
    public double bonificacao() {
        double salario = (this.getSalario() + 1000.00) * this.getGrauInstrucao() * 2;
        System.out.println("Funcionario: " + getNome() + " - Idade: " + getIdade()
                + " - Grau de Instrução: " + getGrauInstrucao()
                + " - Salário R$ " + salario + ".");

        return salario;
    }
}
