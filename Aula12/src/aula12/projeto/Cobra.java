package aula12.projeto;

public class Cobra extends Reptil {

    @Override
    public String toString() {
        return "\nCobra{" +
                "corEscama='" + corEscama + '\'' +
                ", peso=" + peso +
                ", idade=" + idade +
                ", membros=" + membros +
                '}';
    }
}
