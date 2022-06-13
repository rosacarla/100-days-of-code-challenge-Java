package aula12.projeto;

public class Canguru extends Mamifero {
    //Sobreposição de metodo de Mamifero
    @Override
    public void locomover() {  //mantem mesma assinatura
        System.out.println("\nCanguru saltando.");
    }

    //Metodo publico personalizado
    public void usarBolsa() {
        System.out.println("\nCanguru usando bolsa.");
    }

    @Override
    public String toString() {
        return "Canguru{" +
                "corPelo='" + corPelo + '\'' +
                ", peso=" + peso +
                ", idade=" + idade +
                ", membros=" + membros +
                '}';
    }
}
