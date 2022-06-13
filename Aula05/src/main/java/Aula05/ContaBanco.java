/*
 * Classe ContaBanco
 */
package Aula05;

/**
 *
 * @author carla
 */
public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    //Metodos Personalizados
    public void estadoAtual() {  //mostra resultados na tela
        System.out.println("----------------------------\n");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());        
    }
    
    public void abrirConta(String t) {
        this.setTipo(t);
        this.setStatus(true);
        if ("CC".equals(t)) {  //original era if t == "CC"
            this.setTipo(t);
            this.setStatus(true);
            this.setSaldo(50);
        } else if ("CP".equals(t)) { //original era if t == "CP"
            this.setSaldo(150);
        }
        System.out.println("\nConta aberta com sucesso, " + getDono() + "!");
    }
    
    public void fecharConta() {
        if (this.getSaldo() > 0) {
            System.out.println("\n" + getDono() + ", conta não pode ser fechada porque tem saldo.");
        } else if (this.getSaldo() < 0) {
            System.out.println("\n" + getDono() + ", conta não pode ser fechada porque tem débito.");
        } else {
            this.setStatus(false);
            System.out.println("\n" + getDono() + ", conta fechada com sucesso!");
        }                
    }
    
    public void depositar(float v) {
        if (this.getStatus()) {
            //this.saldo = this.saldo + v;   -> altera direto o atributo
            this.setSaldo(this.getSaldo() + v);
            System.out.println("\nDepósito realizado na conta de " + this.getDono() + ".");
        } else {
            System.out.println("\n" + getDono() + ", impossivel depositar em uma conta fechada!");
        }
        
    }
    
    public void sacar(float v) {
        if (this.getStatus()) {
            if (this.getSaldo() >= v) {
                this.setSaldo(this.getSaldo() - v);
                System.out.println("\nSaque realizado da conta de " + this.getDono() + ".");
            } else {
                System.out.println("\n" + this.getDono() + ", saldo insuficiente para saque.");
            }
        } else {
            System.out.println("\n" + getDono() + ", impossivel sacar de uma conta fechada!");
        }        
    }
    
    public void pagarMensal() {
        int v = 0;
        if ("CC".equals(this.getTipo())) {
            v = 12;
        } else if ("CP".equals(this.getTipo())) {
            v = 20;           
        }
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() - v);
            System.out.println("\nMensalidade paga com sucesso por " + this.getDono() + ".");
        } else {
            System.out.println("\n" + getDono() + ", impossivel pagar com uma conta fechada!");
        }        
    }
    
    //Metodos Especiais
    public ContaBanco() {
        this.saldo = 0;
        this.status = false;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
}


