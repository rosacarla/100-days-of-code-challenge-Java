/*
 * Classe aula04 para criação de metodos modificadores e construtor
*/

package aula04;

/**
 *
 * @author carla
 */
public class Aula04 {

    public static void main(String[] args) {
        Canetta c1 = new Canetta("BIC","Azul",0.5f);
        //c1.setModelo("BIC");  //usa metodo acessor
        //c1.modelo = "BIC"; //acessa diretamente o atributo dá erro
        
        //c1.setPonta(0.5f); 
        //c1.ponta = 0.5f;  //dá erro porque o atributo é private 
        
        c1.status();
        
        System.out.println("Tenho uma caneta " + c1.getModelo() +
                " de ponta " + c1.getPonta() + ".");
        
        Canetta c2 = new Canetta("NIC", "Amarelo", 0.4f);
        c2.status();
    }
}
