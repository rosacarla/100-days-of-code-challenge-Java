package aula12.projeto;

public class Ave extends Animal {
    protected String corPena;

    //Sobreposicao de metodos abstratos de Animal
    @Override
    public void locomover() {
        System.out.println("Voando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo frutas");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de ave");
    }

    //Metodo publico personalizado
    public void fazerNinho() {
        System.out.println("Construindo ninho");
    }

    //Metodos getter e setter
    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }

    //sobrescreve toString de Ave
    @Override
    public String toString() {
        return "\nAve{" +
                "corPena='" + corPena + '\'' +
                ", peso=" + peso +
                ", idade=" + idade +
                ", membros=" + membros +
                '}';
    }
}
