package projeto.colab;

public abstract class Colaborador {
    private String nome;
    private int idade;
    private double salario;
    private int grauInstrucao;

    //construtor
    public Colaborador() {
    }

    //construtor da classe
    public Colaborador(String nome, int idade, double salario, int grauInstrucao) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
        this.grauInstrucao = grauInstrucao;
    }

    //metodo abstrato para calculo de bonificacao
    public abstract double bonificacao();


    //getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getGrauInstrucao() {
        return grauInstrucao;
    }

    public void setGrauInstrucao(int grauInstrucao) {
        this.grauInstrucao = grauInstrucao;
    }


    //sobrecreve toString

    @Override
    public String toString() {
        return "Colaborador{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", salario=" + salario +
                ", grauInstrucao=" + grauInstrucao +
                '}';
    }
}
