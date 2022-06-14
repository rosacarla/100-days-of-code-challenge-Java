package projeto.colab;

public class Vendedor extends Colaborador {

    //construtor


    public Vendedor(String nome, int idade, double salario, int grauInstrucao) {
        super(nome, idade, salario, grauInstrucao);
    }

    @Override
    public double bonificacao() {
        double bonificacao = (this.getSalario() + 300.00) * this.getGrauInstrucao() * 4;
        double salario = this.getSalario() + bonificacao;
        System.out.println("Funcionario: " + getNome() + " - Idade: " + getIdade()
                + " - Grau de Instrução: " + getGrauInstrucao()
                + " - Salário R$ " + salario + ".");
        return salario;

    }
}
