package aula11.projeto;

//Classe Aluno é publica, se fosse "final" não poderia ter subclasse
public class Aluno extends Pessoa {
    private int matricula;
    private String curso;

    //Metodo publico possibilita sobreposição, se fosse "final" daria erro
    public void pagarMensalidade() {
        System.out.println("\nPagando mensalidade do aluno " + this.nome + ".");
    }

    //Metodos especiais getters e setters
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
        System.out.println("\nConfira se está correta a matrícula " + this.getMatricula() + " de " + this.nome + ".");
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
