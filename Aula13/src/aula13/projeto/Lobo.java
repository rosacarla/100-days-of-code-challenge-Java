package aula13.projeto;

public class Lobo extends Mamifero {  //implantada a herança
    //Sobreposição de metodo com saída diferente da classe mae
    @Override
    public void emitirSom() {
        System.out.println("Auuuuuuuu!");
    }

}
