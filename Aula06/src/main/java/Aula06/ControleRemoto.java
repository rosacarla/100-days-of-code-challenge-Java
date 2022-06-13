/*
 * Classe ControleRemoto 
 */
package Aula06;

/**
 *
 * @author carla
 */
public class ControleRemoto implements Controlador {  //atributos encapsulados
    private int volume;
    private boolean ligado;
    private boolean tocando;
    
    //Metodos Especiais
    public ControleRemoto() {
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }
    
    //Metodos getters e setters são privados
    private int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean getLigado() {
        return ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private boolean getTocando() {
        return tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }
    
    //Metodos abstratos - CTRL + E para apagar linha

    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("-----------------");
        System.out.println("\nEstá ligado? " + this.getLigado());
        System.out.println("Está tocando? " + this.getTocando());
        System.out.print("Volume? " + this.getVolume());
        for (int i = 0; i <= this.getVolume(); i+=10) {
            System.out.print("|");
        }  
        System.out.print("");
    }

    @Override
    public void fecharMenu() {
        System.out.println("\nFechando Menu... ");        
    }

    @Override
    public void maisVolume() {
        if (this.getLigado()) {
            this.setVolume(this.getVolume() + 5);
        } else {
            System.out.println("\nImpossivel aumentar volume!");
        }
    }

    @Override
    public void menosVolume() {
        if (this.getLigado()) {
            this.setVolume(this.getVolume() - 5);
        } else {
            System.out.println("\nImpossivel diminuir volume!");
        }
    }

    @Override
    public void ligarMudo() {
        if (this.getLigado() && this.getVolume() > 0) {
            this.setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        if (this.getLigado() && this.getVolume() == 0) {
            this.setVolume(50);
        }
    }

    @Override
    public void play() {  //condição depende de metodo Tocando
        if (this.getLigado() && !(this.getTocando())) {
            this.setTocando(true);
        } else {
            System.out.println("\nNão consegui reproduzir!");
        }
    }
    
    @Override
    public void pause() {  //condição depende de metodo Tocando
        if (this.getLigado() && this.getTocando()) {
            this.setTocando(false);
        } else {
            System.out.println("\nNão consegui pausar!");
        }
    }  
    
}
