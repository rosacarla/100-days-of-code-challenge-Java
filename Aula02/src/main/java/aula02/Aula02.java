/*
 *Classe Aula02 com método principal para instanciar objetos e
* chamar seus métodos pra manipulação de atributos e estado.
 */

package aula02;

/**
 *
 * @author carla
 */
public class Aula02 {

    public static void main(String[] args) {
  /*    Caneta c1 = new Caneta(); //instancia primero objeto        
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.tampada = false;
        c1.tampar(); //chama metodo pra tampar caneta = true
        //c1.destampar(); // chama metodo pra destampar caneta = false
        
        c1.status();  //exibe status do obj com metodo definido na classe Caneta
        c1.rabiscar(); //chama metodo rabiscar 1a vez tampada, 2a vez destampada
        
        Caneta c2 = new Caneta(); //instancia segundo objeto
        c2.modelo = "Hostnet";
        c2.cor = "Preta";
        c2.destampar(); //status destampada 
        
        c2.status();  //mostra status da 2a caneta
        c2.rabiscar();   
  
        TelaDesktop td1 = new TelaDesktop();
        td1.alimentacaoV = 220;
        td1.frequenciaHz = 60;
        td1.pesoKg = 3.5;
        td1.tamanhoPol = 21.5;
        td1.resolucao = "FULL HD";
        td1.tecnologia = "LED LCD";
        td1.ligada = true;
        
        td1.status();        
        
        td1.desligar();
        td1.suspender();        
        td1.ligar();
        td1.suspender();*/
  
        Banho b1 = new Banho();
        b1.tipo = "chuveiro";
        b1.temperatura = "morno";
        b1.duracao = 10;
        b1.sabonete = "óleo Nívea";
        b1.shampoo = "Elseve Hidrahialurônico";
        b1.iniciado = true;
                
        b1.estado();
        
        b1.iniciar();        
        b1.cabelo_lavar();
        b1.terminar();

        Banho b2 = new Banho();
        b2.tipo = "banheira";
        b2.temperatura = "quente";
        b2.duracao = 20;
        b2.sabonete = "espuma Boticário";
        b2.iniciado = false;
        
        b2.estado();
        b2.iniciar();
        b2.terminar();
        b2.cabelo_lavar();
                
    }
    
}
