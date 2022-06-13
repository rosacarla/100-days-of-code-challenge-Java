/*
 * Classe Aula06 executa código da classe ControleRemoto
 */

package Aula06;

/**
 *
 * @author carla
 */
public class Aula06 {
    public static void main(String[] args) {
        ControleRemoto c = new ControleRemoto();
        c.ligar();
        c.menosVolume();
        //c.ligarMudo();
        c.play();
        c.menosVolume();
        c.menosVolume();
        c.abrirMenu(); 
        c.fecharMenu();
        //c.volume = 80;  //é impossivel, pois atributo foi encapsulado (private)
        //c.setVolume(80); //também impossivel devido o encapsulamento
    }
}
