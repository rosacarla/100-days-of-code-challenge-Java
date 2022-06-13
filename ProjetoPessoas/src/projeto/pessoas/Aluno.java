package projeto.pessoas;

public class Aluno extends Pessoa {
    private int mat;
    private String curso;

    //Metodo publico
    public void cancelarMatr() {
        System.out.println("\nMatrícula de " + getNome() + " será cancelada.\n");
    }

    //Metodos getters e setters
    public int getMat() {
        return mat;
    }

    public void setMat(int mat) {
        this.mat = mat;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
