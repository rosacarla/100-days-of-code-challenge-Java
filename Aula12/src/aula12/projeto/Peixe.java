package aula12.projeto;

public class Peixe extends Animal {
    protected String corEscama;

    //Sobreposicao de metodos abstratos de Animal
    @Override
    public void locomover() {
        System.out.println("Nadando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo substancias");
    }

    @Override
    public void emitirSom() {
        System.out.println("Peixe nao emite som");
    }

    //Metodo publico personalizado
    public void soltarBolha() {
        System.out.println("Soltando bolha");
    }

    //Metodos getter e setter
    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

    //sobrescreve toString() de Peixe
    @Override
    public String toString() {
        return "\nPeixe{" +
                "corEscama='" + corEscama + '\'' +
                ", peso=" + peso +
                ", idade=" + idade +
                ", membros=" + membros +
                '}';
    }
}
