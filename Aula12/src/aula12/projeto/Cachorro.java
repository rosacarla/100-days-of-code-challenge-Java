package aula12.projeto;

public class Cachorro extends Mamifero {
    //Sobreposicao de metodo do Mamifero
    @Override
    public void emitirSom() {
        System.out.println("Au! Au! Au!");
    }

    @Override
    public String toString() {
        return "\nCachorro{" +
                "corPelo='" + corPelo + '\'' +
                ", peso=" + peso +
                ", idade=" + idade +
                ", membros=" + membros +
                '}';
    }
}
