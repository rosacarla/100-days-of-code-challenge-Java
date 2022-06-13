package aula12.projeto;

//Classe abstrata, somente filhas serao instanciadas
public abstract class Animal {
    //Atributos de Animal
    protected float peso;
    protected int idade;
    protected int membros;

    //Metodos de Animal
    public abstract void locomover();
    public abstract void alimentar();
    public abstract void emitirSom();

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getMembros() {
        return membros;
    }

    public void setMembros(int membros) {
        this.membros = membros;
    }

    //sobrescreve toString de Animal
    @Override
    public String toString() {
        return "\nAnimal{" +
                "peso=" + peso +
                ", idade=" + idade +
                ", membros=" + membros +
                '}';
    }
}
