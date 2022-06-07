/*
 * Classe Banho para instanciar objetos e mexer em atributos com metodos
 */
package aula02;

/**
 *
 * @author carla
 */

public class Banho {
    String tipo;
    String temperatura;
    String sabonete;
    String shampoo;
    int duracao;
    boolean iniciado;
    
    void estado() {  
        System.out.println("\nUm banho de " + this.tipo);
        System.out.println("\nTemperatura: " + this.temperatura);
        System.out.println("\nDuração: " + this.duracao + " min.");        
        System.out.println("\nSabonete: " + this.sabonete);
        System.out.println("\nShampoo: " + this.shampoo);        
        System.out.println("\nTomou banho? " + this.iniciado);     
    }
    
    void iniciar() {
        this.iniciado = true;
        System.out.println("\nTomando banho.");        
        
    }
    
    void cabelo_lavar() {
        if (this.iniciado == true) {  
            System.out.println("\nLavando o cabelo." );            
        } else {  
            System.out.println("\nBanho terminado. Lave o cabelo depois.");
        }
    }
    
    void terminar() {
        this.iniciado = false;
        System.out.println("\nTerminado o banho." );
        
    }       
}
            

