/*
 * Classe TelaDesktop para criação de objeto concreto.
 */
package aula02;

/**
 *
 * @author carla
 */
public class TelaDesktop {
    String tecnologia;
    String resolucao;
    double tamanhoPol;
    double pesoKg;    
    int frequenciaHz;
    int alimentacaoV;
    boolean ligada;
    boolean suspensa;
    
    void status() {  //criado metodo para mostrar status do objeto
        System.out.print("Tecnologia: " + this.tecnologia);
        System.out.print("\nResolução: " + this.resolucao); 
        System.out.print("\nTamanho: " + this.tamanhoPol + " pol");
        System.out.print("\nPeso: " + this.pesoKg + " kg");
        System.out.print("\nFrequência: " + this.frequenciaHz + " Hz");
        System.out.print("\nAlimentação: " + this.pesoKg + " V");
        System.out.print("\nEstá ligada? " + this.ligada);
    }   
       
    void ligar() {
        this.ligada = true;
        System.out.println("\nEstou ligada.");
           
    }
    
    void desligar() {
        this.ligada = false;
        System.out.println("\nEstou desligada.");
        
    }
    
    void suspender() {        
        if (this.ligada == true) {
            this.suspensa = true;
            System.out.println("\nAgora estou suspensa.");
            
        } else {  
            this.ligada = false;
            System.out.println("\nImpossível suspender! Estou desligada.");
            
        }
        
        if (this.suspensa == true) {
            this.ligada = true;
            System.out.println("\nLigando novamente...");
        }        
    }         
        
}
