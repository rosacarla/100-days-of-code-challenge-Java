package aula12.projeto;

public class GoldFish extends Peixe {
    //sobrescreve toString

    @Override
    public String toString() {
        return "GoldFish{" +
                "corEscama='" + corEscama + '\'' +
                ", peso=" + peso +
                ", idade=" + idade +
                ", membros=" + membros +
                '}';
    }
}

