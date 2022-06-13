package aula11.projeto;

public class Tecnico extends Aluno {
    private int registroProfissional;

    public void praticar() {
        System.out.println("\nTecnico " + this.nome + " está praticando.");
    }

    //Metodos getter e setter
    public int getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(int registroProfissional) {
        this.registroProfissional = registroProfissional;
    }
}
