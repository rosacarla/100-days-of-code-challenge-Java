package projeto.pessoas;

public class Funcionario extends Pessoa {
    private String setor;
    private boolean trabalhando;

    //Metodo publico
    public void mudarTrabalho() {
        this.trabalhando = !this.trabalhando;
        System.out.println("\nA situação de trabalho de " + getNome() + " mudou.\n");
    }

    //Metodos getters e setters
    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean getTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
}
