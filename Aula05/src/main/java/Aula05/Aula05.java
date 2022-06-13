/*
 * Classe Aula05 executa programa da classe ContaBanco
 */

package Aula05;

/**
 *
 * @author carla
 */
public class Aula05 {
    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco(); //criada conta CC pra Jubileu
        p1.setNumConta(1111);  //nro da conta
        p1.setDono("Jubileu");  //nome do dono
        p1.abrirConta("CC");  //abre a conta CC
        
        ContaBanco p2 = new ContaBanco();
        p2.setNumConta(2222);  //criada conta CP pra Creuza
        p2.setDono("Creuza");
        p2.abrirConta("CP");  //abre a conta CP
             
        //mostra estado atual das contas
        p1.estadoAtual();  
        p2.estadoAtual();
        
        //depositos nas contas
        p1.depositar(100);
        p2.depositar(500);
        
        //mostra estado das contas apos deposito
        p1.estadoAtual();
        p2.estadoAtual();
        
        //saque na conta de Creuza
        p2.sacar(100);
        
        //mostra estado das contas apos saque de Creuza
        p1.estadoAtual();
        p2.estadoAtual();    
        
        //saque na conta de Jubileu
        p1.sacar(1000);
        
        //mostra estado das contas apos saque de Jubileu
        p1.estadoAtual();
        p2.estadoAtual(); 
        
        //saque na conta de Jubileu
        p1.sacar(100);
        
        //mostra estado das contas apos saque de Jubileu
        p1.estadoAtual();
        p2.estadoAtual(); 
        
        //fechar conta de Jubileu
        p1.fecharConta();
        
        //mostra estado de contas apos tentar fechar CC de Jubileu
        p1.estadoAtual();
        p2.estadoAtual();
        
        //sacar e fechar conta de Jubileu
        p1.sacar(50);
        p1.fecharConta();
        
        //mostra estado de contas apos fechar CC de Jubileu
        p1.estadoAtual();
        p2.estadoAtual();        
    }
}
