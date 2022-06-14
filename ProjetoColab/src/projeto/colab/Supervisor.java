package projeto.colab;

public class Supervisor extends Colaborador {

    //construtor

    public Supervisor(String nome, int idade, double salario, int grauInstrucao) {
        super(nome, idade, salario, grauInstrucao);
    }

    @Override
    public double bonificacao() {
        double salario = (this.getSalario() + 500.00) * this.getGrauInstrucao() * 3;
        System.out.println("Funcionario: " + getNome() + " - Idade: " + getIdade()
                + " - Grau de Instrução: " + getGrauInstrucao()
                + " - Salário R$ " + salario + ".");
        return salario;
    }
}
