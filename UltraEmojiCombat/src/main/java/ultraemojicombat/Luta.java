/*
 * Calsse Luta para agregação com classe Lutador
 */
package ultraemojicombat;

import java.util.Random;

/**
 *
 * @author carla
 */
public class Luta {
    //Aributos
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;
    
    //Metodos publicos personalizados
    public void marcarLuta(Lutador l1, Lutador l2) {
        if (l1.getCategoria().equals(l2.getCategoria()) && l1 != l2) {
            this.aprovada = true;
            this.desafiado = l1;
            this.desafiante = l2;
        } else {
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }    
    }    
    public void lutar() {
        if (this.aprovada) {
            System.out.println("\n### DESAFIADO ###");
            this.desafiado.apresentar();
            System.out.println("\n### DESAFIANTE ###");
            this.desafiante.apresentar();
            
            Random aleatorio = new Random(); //importada biblioteca java.util
            int vencedor = aleatorio.nextInt(3); //0 1 2 
            System.out.println("\n====== RESULTADO DA LUTA ======");
            switch(vencedor) {
                case 0: //empate
                    System.out.println("\nEmpatou!");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                case 1: //Desafiado vence
                    System.out.println("\nVitoria do " + this.desafiado.getNome());
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();                    
                    break;
                case 2: //Desafiante vence
                    System.out.println("\nVitoria do " + this.desafiante.getNome());
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();                           
                    break; 
            }
            System.out.println("===============================");              
            
            } else {           
            System.out.println("\n======= LUTA NÃO APROVADA ======");             
            System.out.println("\nA luta não pode acontecer!");
            System.out.println("================================");
        }                                   
        
    }
        
    //Metodos especiais getters e setters    
    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
}
