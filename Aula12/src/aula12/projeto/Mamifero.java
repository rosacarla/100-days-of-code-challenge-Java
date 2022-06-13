package aula12.projeto;

public class Mamifero extends Animal{
    protected String corPelo;

    //Sobreposição de metodos abstratos de Animal
    @Override
    public void locomover() {
        System.out.println("Correndo");
    }

    @Override
    public void alimentar() {
        System.out.println("Mamando");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de mamifero");
    }

    //Metodos getter e setter
    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }

    //sobrescreve toString() de Mamifero
    @Override
    public String toString() {
        return "\nMamifero{" +
                "corPelo='" + corPelo + '\'' +
                ", peso=" + peso +
                ", idade=" + idade +
                ", membros=" + membros +
                '}';
    }
}
