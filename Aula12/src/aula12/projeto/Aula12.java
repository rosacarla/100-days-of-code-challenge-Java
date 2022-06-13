package aula12.projeto;

/**
 * Classe chamadora dos metodos da classe Animal
 * e das subclasses Mamifero, Reptil, Peixe, Ave.
 */

public class Aula12 {
    public static void main(String[] args) {
        //Animal n = new Animal();  --> impossivel por ser classe abstrata
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        Canguru c = new Canguru();
        Cachorro k = new Cachorro();
        Cobra j = new Cobra();
        Tartaruga t = new Tartaruga();
        GoldFish g = new GoldFish();
        Arara e = new Arara();

        c.locomover();  //mostra metodo sobreposto
        c.usarBolsa();
        k.locomover(); //mostra metodo herdado de Mamifero
        k.emitirSom();
        c.emitirSom();

        //Instanciado objeto da classe Mamifero
        m.setPeso(35.3f);
        m.setCorPelo("Marrom");
        m.alimentar();
        m.locomover();
        m.emitirSom();
        System.out.println(m);

        //Instanciado metodo locomover pra diferentes objetos
        r.locomover();
        p.locomover();
        a.locomover();

        //Instanciados metodos de demais animais
        j.setCorEscama("Verde");
        t.setPeso(16.78f);
        t.setIdade(36);
        g.setCorEscama("Amarela");
        g.setPeso(0.38f);
        e.setMembros(2);
        e.setIdade(14);

        j.alimentar();
        t.locomover();
        g.soltarBolha();
        e.emitirSom();

        System.out.println(j);
        System.out.println(t);
        System.out.println(g);
        System.out.println(e);

    }
}
