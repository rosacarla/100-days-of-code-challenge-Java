package aula13.projeto;

public class Mamifero extends Animal {   //implantada a herança
    protected String corPelo;

    //Sobreposição de metodo de Animal
    @Override
    public void emitirSom() {
        System.out.println("Som de mamifero");
    }
}
