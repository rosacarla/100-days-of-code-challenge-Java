package aula13.projeto;

/**
 *  Classe chamadora de metodos da classe Animal
 */

public class Aula13 {
    public static void main(String[] args) {
        //Programa Principal
        //Animal x = new Animal(); --> impossivel por ser classe abastrata
        Mamifero x = new Mamifero();
        x.emitirSom();
        Lobo y = new Lobo();
        y.emitirSom();
        Cachorro z = new Cachorro();
        z.emitirSom();

        //instanciado objeto com sobrecarga de métodos
        Cachorro c = new Cachorro();
        c.reagir("Olá");
        c.reagir("Vai apanhar!");
        c.reagir(11,45);
        c.reagir(19,00);
        c.reagir(true);
        c.reagir(false);
        c.reagir(2,12.5f);
        c.reagir(17,4.5f);
    }
}
