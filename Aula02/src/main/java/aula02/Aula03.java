/*
 *Classe Aula03 com método principal pra instanciar objetos e chamar métodos, 
* foram incluídos modificadores de acesso na classe Caneta.
 */

package aula02;

/**
 *
 * @author carla
 */
public class Aula03 {

    public static void main(String[] args) {
        Caneta c1 = new Caneta();  
        c1.modelo = "Bic Cristal";
        c1.cor = "azul";          
        //c1.ponta = 0,5f; //nao rodou por ter visibilidade private
        c1.carga = 80;   
        //c1.tampada = false;
        c1.destampar();
        c1.status();
        c1.rabiscar();
   
    }
}

/*
Para execução com tentativa de alterar atributo ponta (private), houve erro com
a seguinte mensagem:

Exception in thread "main" java.lang.RuntimeException: Uncompilable code - 
ponta has private access in aula02.Caneta
	at aula02.Aula03.main(Aula03.java:1)
Command execution failed.
*/        