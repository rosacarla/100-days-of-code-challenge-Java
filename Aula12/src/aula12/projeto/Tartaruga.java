package aula12.projeto;

public class Tartaruga extends Reptil {
    //sobrescreve toString

    @Override
    public String toString() {
        return "Tartaruga{" +
                "corEscama='" + corEscama + '\'' +
                ", peso=" + peso +
                ", idade=" + idade +
                ", membros=" + membros +
                '}';
    }
}
