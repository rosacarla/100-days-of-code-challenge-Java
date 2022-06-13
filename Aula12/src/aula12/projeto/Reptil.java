package aula12.projeto;

public class Reptil extends Animal {
    protected String corEscama;

    //Sobreposição de metodos abstratos da classe Animal
    @Override
    public void locomover() {
        System.out.println("Rastejando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo vegetais");
    }

    @Override
    public void emitirSom() {
        System.out.println("Emitir som de reptil");
    }

    //Metodos getter e setter
    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

    //sobrescreve toString() de Reptil
    @Override
    public String toString() {
        return "\nReptil{" +
                "corEscama='" + corEscama + '\'' +
                ", peso=" + peso +
                ", idade=" + idade +
                ", membros=" + membros +
                '}';
    }
}
