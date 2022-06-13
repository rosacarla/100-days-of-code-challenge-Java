/*
 * Classe Canetta e seus metodos
 */
package aula04;

/**
 *
 * @author carla
 */
public class Canetta {
    public String modelo;
    private String cor;
    private float ponta;
    private boolean tampada;
    
    //usar Fn+Alt+Insert abre menu pra criar metodos automaticamente

    public Canetta(String modelo, String cor, float ponta) {
        this.modelo = modelo;
        this.cor = cor;
        this.ponta = ponta;       
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getPonta() {
        return ponta;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public boolean isTampada() {
        return tampada;
    }

    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }   
    
    public void status() {
        System.out.println("SOBRE A CANETA: ");
        System.out.println("Modelo: " + getModelo());
        System.out.println("Ponta: " + getPonta());
        System.out.println("Tampada: " + this.isTampada());     
    }
    
}
