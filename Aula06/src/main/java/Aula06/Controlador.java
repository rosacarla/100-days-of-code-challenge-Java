/*
 * Interface Controlador para classe Controle
 */
package Aula06;

/**
 *
 * @author carla
 */
public interface Controlador {
    public abstract void ligar();
    public abstract void desligar();
    public abstract void abrirMenu();
    public abstract void fecharMenu();
    public abstract void maisVolume();
    public abstract void menosVolume();
    public abstract void ligarMudo();
    public abstract void desligarMudo(); 
    public abstract void play();
    public abstract void pause();    
}
