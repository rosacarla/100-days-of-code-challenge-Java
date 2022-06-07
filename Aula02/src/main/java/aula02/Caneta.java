/*
 * Classe Caneta para instanciar objetos e mexer em atributos com métodos.
 */
package aula02;

/**
 *
 * @author carla
 */
public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada; //propria classe pode mexer em atributo private
    
    void status () {  //criado metodo para mostrar status do objeto
        System.out.print("Modelo: " + this.modelo);
        System.out.print("\nUma caneta " + this.cor); //this faz autorreferencia
        //quem chamou o metodo status() é substituído por this
        System.out.print("\nPonta " + this.ponta);
        System.out.print("\nCarga: " + this.carga);
        System.out.print("\nEstá tampada? " + this.tampada);
    }   
    
    public void rabiscar() {
        if (this.tampada == true) {  //condição para rabiscar
            System.out.println("\nERRO! Não posso rabiscar.");
        } else {  //condição contraria
            System.out.println("\nEstou rabiscando.");
        }
    }
    //metodos publicos tampar() e destampar() dão acesso ao atributo tampada...
    //... que é privado. 
    public void tampar() {
        this.tampada = true; //this é referencia a obj (c1) que chamou o metodo
        //this usado pra alterar atributo dentro da própria classe
        System.out.println("\nCaneta tampada.");       
    }
    
    public void destampar() {
        this.tampada = false;
        System.out.println("\nCaneta destampada.");        
    }
    
}
